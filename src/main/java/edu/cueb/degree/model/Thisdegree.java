package edu.cueb.degree.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Thisdegree {
    @Id
    private String id;
    private String year;
    private String national_level;
    private String provincial_level;
    @OneToOne
    private Degreeinformation degreeinformation;

    public void  setDegreeinformation(Degreeinformation degreeinformation) {
        this.degreeinformation = degreeinformation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getNational_level() {
        return national_level;
    }

    public void setNational_level(String national_level) {
        this.national_level = national_level;
    }

    public String getProvincial_level() {
        return provincial_level;
    }

    public void setProvincial_level(String provincial_level) {
        this.provincial_level = provincial_level;
    }
}
