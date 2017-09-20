package be.lapremavera.MiniProject.repo;


import be.lapremavera.MiniProject.domain.Plantensoort;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PlantenSoortRepository extends JpaRepository <Plantensoort, Integer> {

    //Plantensoort getByKlimaat (String klimaat);

}
