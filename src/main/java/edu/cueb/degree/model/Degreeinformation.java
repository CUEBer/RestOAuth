package edu.cueb.degree.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Degreeinformation {
    @Id
    @Column(length = 10 )
    private String id;
    @Column(length = 10)
    private String degreeid;
    @Column(length = 20)
    private String degreename;
    @Column(length = 20 )
    private String incollege;
    @Column(length = 5)
    private String issigdiscipline;
    @Column(length = 20)
    private String approvetime;
    @Column(length = 10)
    private String degreelevel;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDegreeid() {
        return degreeid;
    }

    public void setDegreeid(String degreeid) {
        this.degreeid = degreeid;
    }

    public String getDegreename() {
        return degreename;
    }

    public void setDegreename(String degreename) {
        this.degreename = degreename;
    }

    public String getIncollege() {
        return incollege;
    }

    public void setIncollege(String incollege) {
        this.incollege = incollege;
    }

    public String getIssigdiscipline() {
        return issigdiscipline;
    }

    public void setIssigdiscipline(String issigdiscipline) {
        this.issigdiscipline = issigdiscipline;
    }

    public String getApprovetime() {
        return approvetime;
    }

    public void setApprovetime(String approvetime) {
        this.approvetime = approvetime;
    }

    public String getDegreelevel() {
        return degreelevel;
    }

    public void setDegreelevel(String degreelevel) {
        this.degreelevel = degreelevel;
    }
}
