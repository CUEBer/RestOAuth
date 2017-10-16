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
    private String attachtocollege;
    @Column(length = 200)
    private String projectmember;
    @Column(length = 200)
    private String projectclassification;
    @Column(length = 20)
    private String subclassofproject;
    @Column(length = 10)
    private String projectlevel;
    @Column(length = 100)
    private String projectsourceorganization;
    @Column(length = 20 )
    private String startprojecttime;
    @Column(length = 20)
    private String completetime;
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

    public String getAttachtocollege() {
        return attachtocollege;
    }

    public void setAttachtocollege(String belongcollege) {
        this.attachtocollege =attachtocollege;
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

    public String getProjectsourceorganization() {
        return projectsourceorganization;
    }

    public void setProjectsourceorganization(String projectsourceunit) {
        this.projectsourceorganization = projectsourceorganization;
    }

    public String getStartprojecttime() {
        return startprojecttime;
    }

    public void setStartprojecttime(String projecttime) {
        this.startprojecttime = startprojecttime;
    }

    public String getCompletetime() {
        return completetime;
    }

    public void setCompletetime(String plantime) {
        this.completetime = completetime;
    }

    public String getDisciplineclassification() {
        return disciplineclassification;
    }

    public void setDisciplineclassification(String disciplineclassification) {
        this.disciplineclassification = disciplineclassification;
    }
}
