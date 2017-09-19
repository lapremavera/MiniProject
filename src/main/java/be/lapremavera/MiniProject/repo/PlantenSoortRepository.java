package be.lapremavera.MiniProject.repo;


import be.lapremavera.MiniProject.domain.PlantenSoort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


public interface PlantenSoortRepository extends JpaRepository <PlantenSoort, Integer> {
}
