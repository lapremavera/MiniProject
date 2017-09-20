package be.lapremavera.MiniProject.web;

import be.lapremavera.MiniProject.domain.Plantensoort;
import be.lapremavera.MiniProject.repo.PlantenSoortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

}
