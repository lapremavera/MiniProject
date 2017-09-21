package be.lapremavera.MiniProject.repo;

import be.lapremavera.MiniProject.domain.Plaats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaatsRepository extends JpaRepository <Plaats, Integer> {
}


