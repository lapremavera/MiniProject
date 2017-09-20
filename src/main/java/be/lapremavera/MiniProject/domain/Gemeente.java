package be.lapremavera.MiniProject.domain;

import javax.persistence.*;

@Entity
public class Gemeente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String naam;

    @ManyToOne
    private Grondsoort grondsoort;

    @ManyToOne
    private Klimaat klimaat;

    public Integer getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public Grondsoort getGrondsoort() {
        return grondsoort;
    }

    public Klimaat getKlimaat() {
        return klimaat;
    }
}
