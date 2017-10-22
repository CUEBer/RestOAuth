package edu.cueb.degree.model;



import javax.persistence.*;

@Entity
public class Amount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double pDoctor;
    private double pMaster;
    @Column(columnDefinition = "json")
    @Convert(converter = JpaConverterJson.class)
    private AgeStructure struct[];

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getpDoctor() {
        return pDoctor;
    }

    public void setpDoctor(double pDoctor) {
        this.pDoctor = pDoctor;
    }

    public double getpMaster() {
        return pMaster;
    }

    public void setpMaster(double pMaster) {
        this.pMaster = pMaster;
    }

    public AgeStructure[] getStruct() {
        return struct;
    }

    public void setStruct(AgeStructure[] struct) {
        this.struct = struct;
    }
}
