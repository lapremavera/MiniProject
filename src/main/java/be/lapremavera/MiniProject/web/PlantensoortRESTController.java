package be.lapremavera.MiniProject.web;

import be.lapremavera.MiniProject.domain.Grondsoort;
import be.lapremavera.MiniProject.domain.Klimaat;
import be.lapremavera.MiniProject.domain.Plaats;
import be.lapremavera.MiniProject.domain.Plantensoort;
import be.lapremavera.MiniProject.repo.PlantenSoortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/plantensoort")
public class PlantensoortRESTController {

    @Autowired
    PlantenSoortRepository pr;

    @RequestMapping(method = RequestMethod.GET, path = "all", produces = "application/json")
    public List<Plantensoort> findAll() {
        return pr.findAll();
    }

    @RequestMapping (method = RequestMethod.GET, path = "{id}", produces = "application/json")
    public Plantensoort getById(@PathVariable("id")Integer id)
    {return pr.findOne(id);}

    @RequestMapping (method = RequestMethod.DELETE, path = "{id}")
    public void deleteById(@PathVariable("id")Integer id)
    {pr.delete(id);}

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<Plantensoort> create(@RequestBody Plantensoort input) {
        if(input.getId() != null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        pr.save(input);
        return new ResponseEntity<>(input, HttpStatus.CREATED);
    }
    @RequestMapping(method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
    public ResponseEntity<Plantensoort> update(@RequestBody Plantensoort input) {
        if(input.getId() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        pr.save(input);
        return new ResponseEntity<>(input, HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.GET, produces = "application/json", path="/byPostcode/{postcode}")
    public List<Plantensoort> getByPostcode(@PathVariable("postcode")Integer postcode)
    {
        Plaats plaats = new Plaats();
        plaats.setPostcode(postcode);

        Grondsoort grondsoort = plaats.geefGrondsoort();
        Klimaat klimaat = plaats.getKlimaat();

        List<Plantensoort> allePlantensoorten = pr.findAll();
        List<Plantensoort> gefilterdePlantensoorten = new ArrayList<>();

        for (Plantensoort plSoort : allePlantensoorten) {
            if (plSoort.getGrondsoorten().contains(grondsoort)
                    && (plSoort.getKlimaten().contains(klimaat))) {
                gefilterdePlantensoorten.add(plSoort);

            }
        }

        return gefilterdePlantensoorten;
    }


}
