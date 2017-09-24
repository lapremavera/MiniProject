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
    private String naamLatijn;

    @Column
    private Integer maxHoogte;
    @Column
    private Integer duurTotPluk;
    @Column
    private String oogsttijd;
    @Column
    private String beschrijvingPlantsoort;
    @Column
    private Integer plantAfstand;
    @Column
    private String groeiVoorwaarden;
    @Column
    private String afbeelding;

    @ElementCollection
    @CollectionTable(name = "plantensoort_orientaties")
    @Column(name = "orientatie")
    @Enumerated(EnumType.STRING)
    private List<Orientatie> orientaties = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "plantensoort_klimaten")
    @Column(name = "klimaat")
    @Enumerated(EnumType.STRING)
    private List<Klimaat> klimaten = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "plantensoort_grondsoorten")
    @Column(name = "grondsoort")
    @Enumerated(EnumType.STRING)
    private List<Grondsoort>grondsoorten=new ArrayList<>();


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

    public Integer getPlantAfstand() {
        return plantAfstand;
    }

    public void setPlantAfstand(Integer plantAfstand) {
        this.plantAfstand = plantAfstand;
    }


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

    public Integer getMaxHoogte() {
        return maxHoogte;
    }

    public void setMaxHoogte(Integer maxHoogte) {
        this.maxHoogte = maxHoogte;
    }

    public Integer getDuurTotPluk() {
        return duurTotPluk;
    }

    public void setDuurTotPluk(Integer duurTotPluk) {
        this.duurTotPluk = duurTotPluk;
    }


    public List<Orientatie> getOrientaties() {
        return orientaties;
    }

    public List<Klimaat> getKlimaten() {
        return klimaten;
    }

    public List<Grondsoort> getGrondsoorten() {
        return grondsoorten;
    }

    public void setGrondsoorten(List<Grondsoort> grondsoorten) {
        this.grondsoorten = grondsoorten;
    }
}




