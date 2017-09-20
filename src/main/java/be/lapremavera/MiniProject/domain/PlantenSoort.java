package be.lapremavera.MiniProject.domain;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class PlantenSoort {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String naamSoort;
    @Column
    private int maxHoogte;
    @Column
    private int duurTotPluk;
    @Column
    private String oogsttijd;
    @Column
    private String beschrijvingPlantSoort;

    @OneToMany
    private List<Grondsoort> grondsoorten = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "planten_soort_orientaties")
    @Column(name = "orientatie")
    @Enumerated(EnumType.STRING)
    private List<Orientatie> orientaties = new ArrayList<>();

    @OneToMany
    private List<Klimaat> klimaten = new ArrayList<>();

    public PlantenSoort() {
    }

    public PlantenSoort(String naamSoort) {
        this.naamSoort = naamSoort;
    }

    public Integer getId() {
        return id;
    }

    public String getNaamSoort() {
        return naamSoort;
    }

    public void setNaamSoort(String naamSoort) {
        this.naamSoort = naamSoort;
    }

    public int getMaxHoogte() {
        return maxHoogte;
    }

    public void setMaxHoogte(int maxHoogte) {
        this.maxHoogte = maxHoogte;
    }

    public int getDuurTotPluk() {
        return duurTotPluk;
    }

    public void setDuurTotPluk(int duurTotPluk) {
        this.duurTotPluk = duurTotPluk;
    }

    public List<Grondsoort> getGrondsoorten() {
        return grondsoorten;
    }

    public List<Orientatie> getOrientaties() {
        return orientaties;
    }

    public List<Klimaat> getKlimaten() {
        return klimaten;
    }
}




