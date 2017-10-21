package edu.cueb.degree.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AdmissionConditions {
    @Id
    @Column(length = 4)
    private String id;
    @Column(length = 5)
    private String FirstChoiceExamAmount;
    @Column(length = 4)
    private String FirstChoiceOnlineAmount;
    @Column(length = 4)
    private String ProvinceAndpPrestigiousUniversity;
    @Column(length = 20)
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

    public String getFirstChoiceExamAmount() {
        return FirstChoiceExamAmount;
    }

    public void setFirstChoiceExamAmount(String firstChoiceExamAmount) {
        FirstChoiceExamAmount = firstChoiceExamAmount;
    }

    public String getFirstChoiceOnlineAmount() {
        return FirstChoiceOnlineAmount;
    }

    public void setFirstChoiceOnlineAmount(String firstChoiceOnlineAmount) {
        FirstChoiceOnlineAmount = firstChoiceOnlineAmount;
    }

    public String getProvinceAndpPrestigiousUniversity() {
        return ProvinceAndpPrestigiousUniversity;
    }

    public void setProvinceAndpPrestigiousUniversity(String provinceAndpPrestigiousUniversity) {
        ProvinceAndpPrestigiousUniversity = provinceAndpPrestigiousUniversity;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
