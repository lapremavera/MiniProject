package be.lapremavera.MiniProject.service;

import be.lapremavera.MiniProject.repo.PlantenSoortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;

@Component
public class PlantenSoortService {

    @Autowired
    private PlantenSoortRepository plantenSoortRepository;

    public PlantenSoortService(PlantenSoortRepository plantenSoortRepository) {
        this.plantenSoortRepository = plantenSoortRepository;
    }
}
