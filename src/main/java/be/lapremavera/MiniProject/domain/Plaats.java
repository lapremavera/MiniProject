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

    public boolean isBos () {
        if(postcode%1000==0){
            return false;
        }else {
            return true;
        }

    }
}
