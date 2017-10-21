package edu.cueb.degree.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class DegreeCourse {
    @Id
    @Column(length = 4)
    private String id;
    @Column(length = 20)
    private String coursename;
    @Column(length = 5)
    private String coursetime;
    @Column(length = 20)
    private String teachername;
    @Column(length = 10)
    private String professionaltitle;
    @Column(length = 30)
    private String textbook;
    @OneToOne
    private Discipline discipline;

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCoursetime() {
        return coursetime;
    }

    public void setCoursetime(String coursetime) {
        this.coursetime = coursetime;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public String getProfessionaltitle() {
        return professionaltitle;
    }

    public void setProfessionaltitle(String professionaltitle) {
        this.professionaltitle = professionaltitle;
    }

    public String getTextbook() {
        return textbook;
    }

    public void setTextbook(String textbook) {
        this.textbook = textbook;
    }
}
