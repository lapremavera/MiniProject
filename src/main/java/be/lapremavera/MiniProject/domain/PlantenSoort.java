package be.lapremavera.MiniProject.domain;


import javax.persistence.*;

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
}




