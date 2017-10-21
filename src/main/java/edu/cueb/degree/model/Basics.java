package edu.cueb.degree.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Basics {
    @Id
    @Column(length = 4)
    private String id;
    @Column(length = 10)
    private String degreeid;
    @Column(length = 20)
    private String degreename;
    @Column(length = 20)
    private String school;
    @Column(length = 10)
    private String keydiscipline;
    @Column(length = 20)
    private String approvaldate;
    @Column(length = 10)
    private String degreelevel;

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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getKeydiscipline() {
        return keydiscipline;
    }

    public void setKeydiscipline(String keydiscipline) {
        this.keydiscipline = keydiscipline;
    }

    public String getApprovaldate() {
        return approvaldate;
    }

    public void setApprovaldate(String approvaldate) {
        this.approvaldate = approvaldate;
    }

    public String getDegreelevel() {
        return degreelevel;
    }

    public void setDegreelevel(String degreeleve) {
        this.degreelevel = degreelevel;
    }
}
