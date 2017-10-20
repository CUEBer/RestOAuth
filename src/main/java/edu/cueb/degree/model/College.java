package edu.cueb.degree.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {
    @Id
    @Column(length = 10)
    private String id;
    @Column(length = 20)
    private String collegeid;
    @Column(length = 20)
    private String collegename;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCollegeid() {
        return collegeid;
    }

    public void setCollegeid(String collegeid) {
        this.collegeid = collegeid;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }
}
