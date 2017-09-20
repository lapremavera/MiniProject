package be.lapremavera.MiniProject.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Klimaat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String naam;

    private int regenHoeveelheid;

    public Klimaat() {

    }

    public Klimaat(String naam, int regenHoeveelheid) {
        this.naam = naam;
        this.regenHoeveelheid = regenHoeveelheid;
    }

    public Integer getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public int getRegenHoeveelheid() {
        return regenHoeveelheid;
    }
}
