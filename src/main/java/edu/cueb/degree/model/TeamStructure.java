package edu.cueb.degree.model;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TeamStructure {
    @Id
    private int disc_id;
    private double pDoctor;
    private double pMaster;
    @Column(columnDefinition="json")
    @Convert(converter = JpaConverterJson.class)
    private AgeStructure struct[];

    public int getDisc_id() {
        return disc_id;
    }

    public void setDisc_id(int disc_id) {
        this.disc_id = disc_id;
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
