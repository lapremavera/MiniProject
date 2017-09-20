package be.lapremavera.MiniProject.domain;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Plantensoort {
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
    private String beschrijvingPlantsoort;
    @Column
    private int plantAfstand;
    @Column
    private String groeiVoorwaarden;

    public String getGroeiVoorwaarden() {
        return groeiVoorwaarden;
    }

    public void setGroeiVoorwaarden(String groeiVoorwaarden) {
        this.groeiVoorwaarden = groeiVoorwaarden;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOogsttijd() {
        return oogsttijd;
    }

    public void setOogsttijd(String oogsttijd) {
        this.oogsttijd = oogsttijd;
    }

    public String getBeschrijvingPlantsoort() {
        return beschrijvingPlantsoort;
    }

    public void setBeschrijvingPlantsoort(String beschrijvingPlantsoort) {
        this.beschrijvingPlantsoort = beschrijvingPlantsoort;
    }

    public int getPlantAfstand() {
        return plantAfstand;
    }

    public void setPlantAfstand(int plantAfstand) {
        this.plantAfstand = plantAfstand;
    }

    @OneToMany
    private List<Grondsoort> grondsoorten = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "plantensoort_orientaties")
    @Column(name = "orientatie")
    @Enumerated(EnumType.STRING)
    private List<Orientatie> orientaties = new ArrayList<>();

    @OneToMany
    private List<Klimaat> klimaten = new ArrayList<>();

    public Plantensoort() {
    }

    public Plantensoort(String naamSoort) {
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



