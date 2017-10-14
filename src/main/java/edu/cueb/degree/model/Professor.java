package edu.cueb.degree.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Professor {
    @Id
    @Column(length = 4)
    private String directionid;
    @Column(length = 4)
    private String teacherid;

    public String getDirectionid() {
        return directionid;
    }

    public void setDirectionid(String directionid) {
        this.directionid = directionid;
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid;
    }
}

