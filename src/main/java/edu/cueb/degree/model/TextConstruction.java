package edu.cueb.degree.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class TextConstruction {
    @Id
    @Column(length = 4)
    private String id;
    @Column(length = 20)
    private String textname;
    @Column(length = 10)
    private String author;
    @Column(length = 20)
    private String publictime;
    @Column(length = 20)
    private String awardcondition;

    public String getId() {
        return id;
    }
    @OneToOne
    private Discipline discipline;

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTextname() {
        return textname;
    }

    public void setTextname(String textname) {
        this.textname = textname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublictime() {
        return publictime;
    }

    public void setPublictime(String publictime) {
        this.publictime = publictime;
    }

    public String getAwardcondition() {
        return awardcondition;
    }

    public void setAwardcondition(String awardcondition) {
        this.awardcondition = awardcondition;
    }
}
