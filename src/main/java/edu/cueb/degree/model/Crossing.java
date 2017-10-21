package edu.cueb.degree.model;

import javax.persistence.*;

@Entity
public class Crossing {
    @Id
    @Column(length = 4)
    private String id;
    @Column(length = 10)
    private String projectid;
    @Column(length = 100)
    private String projectname;
    @Column(length = 20)
    private String resource;
    @Column(length = 30)
    private String beginningandendingtime;
    @Column(length = 10)
    private String principal;
    @Column(length = 10)
    private String investment;
    @OneToOne
    private Discipline discipline;

    public void setProjectid(String projectid) {
        this.projectid = projectid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getBeginningandendingtime() {
        return beginningandendingtime;
    }

    public void setBeginningandendingtime(String beginningandendingtime) {
        this.beginningandendingtime = beginningandendingtime;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

     public String getInvestment() {
           return investment;
            }

     public void setInvestment(String investment) {
       this.investment = investment;
        }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }
}

