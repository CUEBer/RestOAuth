package edu.cueb.degree.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PrizeLevel {
    @Id
    @Column(length = 4)
    private String id;
    @Column(length = 5)
    private String grandprize;
    @Column(length = 5)
    private String firstprize;
    @Column(length = 5)
    private String secondprize;
    @Column(length = 5)
    private String thirdprize;
    @Column(length = 10)
    private String year;
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

    public String getGrandprize() {
        return grandprize;
    }

    public void setGrandprize(String grandprize) {
        this.grandprize = grandprize;
    }

    public String getFirstprize() {
        return firstprize;
    }

    public void setFirstprize(String firstprize) {
        this.firstprize = firstprize;
    }

    public String getSecondprize() {
        return secondprize;
    }

    public void setSecondprize(String secondprize) {
        this.secondprize = secondprize;
    }

    public String getThirdprize() {
        return thirdprize;
    }

    public void setThirdprize(String thirdprize) {
        this.thirdprize = thirdprize;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
