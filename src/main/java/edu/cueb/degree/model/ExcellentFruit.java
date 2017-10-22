package edu.cueb.degree.model;

import javax.persistence.*;

@Entity
public class ExcellentFruit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 50)
    private String fruitName;
    @Column(length = 30)
    private String awardperson;
    @OneToOne
    private Discipline discipline;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getAwardperson() {
        return awardperson;
    }

    public void setAwardperson(String awardperson) {
        this.awardperson = awardperson;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }
}
