package be.lapremavera.MiniProject.web;


import be.lapremavera.MiniProject.domain.Plaats;
import be.lapremavera.MiniProject.domain.Plantensoort;
import be.lapremavera.MiniProject.repo.PlaatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/gemeente")
public class PlaatsRESTController {
    @Autowired
    PlaatsRepository plaatsRepository;

    @RequestMapping (method = RequestMethod.GET, path = "{postcode}", produces = "application/json")
    public Plaats getByPostcode(@PathVariable("postcode")Integer postcode)
    {return plaatsRepository.findOne(postcode);}
}
