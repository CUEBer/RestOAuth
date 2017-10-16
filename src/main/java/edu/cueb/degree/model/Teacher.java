package edu.cueb.degree.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Teacher {
        @Id
        @Column(length = 10)
        private String id;
        @Column(length = 10)
        private String teacherid;
        @Column(length = 20)
        private String name;
        @Column(length = 20)
        private String dapartment;
        @Column(length = 20)
        private String birth;
        @Column(length = 5)
        private String formation;
        @Column(length = 10)
        private String diploma;
        @Column(length = 5)
        private String degree;
        @Column(length = 20)
        private String position;
        @Column(length = 10)
        private String administration;
        @Column(length = 10)
        private String title;
        @Column(length = 10)
        private String titledegreen;
        @Column(length = 10)
        private String isdelete;

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDapartment() {
        return dapartment;
    }

    public void setDapartment(String dapartment) {
        this.dapartment = dapartment;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAdministration() {
        return administration;
    }

    public void setAdministration(String administration) {
        this.administration = administration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitledegreen() {
        return titledegreen;
    }

    public void setTitledegreen(String titledegreen) {
        this.titledegreen = titledegreen;
    }
}
