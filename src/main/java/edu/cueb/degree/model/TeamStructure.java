package edu.cueb.degree.model;

import edu.cueb.degree.util.JpaConverterJson;

import javax.persistence.*;

@Entity
public class TeamStructure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double pDoctor;
    private double pMaster;
    @Column(columnDefinition = "json")
    @Convert(converter = JpaConverterJson.class)
    private AgeStructure struct[];

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


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AgeStructure[] getStruct() {
        return struct;
    }

    public void setStruct(AgeStructure[] struct) {
        this.struct = struct;
    }


}




