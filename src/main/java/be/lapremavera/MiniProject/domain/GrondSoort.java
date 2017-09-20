package be.lapremavera.MiniProject.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Grondsoort {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String naam;

    public Integer getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }
}
