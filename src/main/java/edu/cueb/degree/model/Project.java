package edu.cueb.degree.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project {
    @Id
    @Column(length = 10)
    private String id;
    @Column(length = 10)
    private String principal;
    @Column(length = 500)
    private String projectname;
    @Column(length = 50)
    private String belongcollege;
    @Column(length = 200)
    private String projectmember;
    @Column(length = 200)
    private String projectclassification;
    @Column(length = 20)
    private String subclassofproject;
    @Column(length = 10)
    private String projectlevel;
    @Column(length = 100)
    private String projectsourceunit;
    @Column(length = 20 )
    private String projecttime;
    @Column(length = 20)
    private String plantime;
    @Column(length = 100)
    private String disciplineclassification;
    @Column(length = 10)
    private String isdelete;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getBelongcollege() {
        return belongcollege;
    }

    public void setBelongcollege(String belongcollege) {
        this.belongcollege = belongcollege;
    }

    public String getProjectmember() {
        return projectmember;
    }

    public void setProjectmember(String projectmember) {
        this.projectmember = projectmember;
    }

    public String getProjectclassification() {
        return projectclassification;
    }

    public void setProjectclassification(String projectclassification) {
        this.projectclassification = projectclassification;
    }

    public String getSubclassofproject() {
        return subclassofproject;
    }

    public void setSubclassofproject(String subclassofproject) {
        this.subclassofproject = subclassofproject;
    }

    public String getProjectlevel() {
        return projectlevel;
    }

    public void setProjectlevel(String projectlevel) {
        this.projectlevel = projectlevel;
    }

    public String getProjectsourceunit() {
        return projectsourceunit;
    }

    public void setProjectsourceunit(String projectsourceunit) {
        this.projectsourceunit = projectsourceunit;
    }

    public String getProjecttime() {
        return projecttime;
    }

    public void setProjecttime(String projecttime) {
        this.projecttime = projecttime;
    }

    public String getPlantime() {
        return plantime;
    }

    public void setPlantime(String plantime) {
        this.plantime = plantime;
    }

    public String getDisciplineclassification() {
        return disciplineclassification;
    }

    public void setDisciplineclassification(String disciplineclassification) {
        this.disciplineclassification = disciplineclassification;
    }
}
