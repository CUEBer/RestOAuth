package edu.cueb.degree.model;

import javax.persistence.*;

@Entity
public class Structure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private Discipline discipline;
    @Column (length=10)
    private String duty;
    @Column(length=10)
    private String totalnumber;
    @Column(length=10)
    private String under35;
    @Column(length=10)
    private String between36to45;
    @Column(length=10)
    private String between46to55;
    @Column(length=10)
    private String between56to60;
    @Column(length=10)
    private String above61;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getTotalnumber() {
        return totalnumber;
    }

    public void setTotalnumber(String totalnumber) {
        this.totalnumber = totalnumber;
    }

    public String getUnder35() {
        return under35;
    }

    public void setUnder35(String under35) {
        this.under35 = under35;
    }

    public String getBetween36to45() {
        return between36to45;
    }

    public void setBetween36to45(String between36to45) {
        this.between36to45 = between36to45;
    }

    public String getBetween46to55() {
        return between46to55;
    }

    public void setBetween46to55(String between46to55) {
        this.between46to55 = between46to55;
    }

    public String getBetween56to60() {
        return between56to60;
    }

    public void setBetween56to60(String between56to60) {
        this.between56to60 = between56to60;
    }

    public String getAbove61() {
        return above61;
    }

    public void setAbove61(String above61) {
        this.above61 = above61;
    }
}
