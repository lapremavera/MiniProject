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


    public Integer getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public Klimaat getKlimaat(){
        if(postcode %100==0){
            return Klimaat.STAD;
        }
        return Klimaat.BOS;
    }


    private boolean isBetween(Integer min, Integer max, Integer value){
        if (value >=min && value <= max) {
            return true;
        }
        return false;
    }

    public Grondsoort geefGrondsoort () {
        if(isBetween(2000, 3990,postcode)|| (isBetween(8000, 8990, postcode))) {
            return Grondsoort.ZAND;

        } else if (isBetween(9000, 9990, postcode)){
            return Grondsoort.ZANDLEEM;
        }
        return Grondsoort.LEEM;

    }




}
