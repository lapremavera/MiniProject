package be.lapremavera.MiniProject.domain;

import javax.persistence.*;

@Entity
public class Plaats {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String naam;


    public Integer getPostcode() {
        return postcode;
    }

    public void setPostcode(Integer postcode) {
        this.postcode = postcode;
    }

    private Integer postcode;


    @Enumerated(EnumType.STRING)
    private Klimaat klimaat;

    @Enumerated(EnumType.STRING)
    private Grondsoort grondsoort;

    public Integer getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public Klimaat getKlimaat() {
        return klimaat;
    }


}
