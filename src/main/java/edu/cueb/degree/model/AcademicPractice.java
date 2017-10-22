package edu.cueb.degree.model;

import javax.persistence.*;

@Entity
public class AcademicPractice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nationalTask;
    private String provincialTask;
    private String directProject;
    @Column(length = 10)
    private String year;
    @OneToOne
    private Discipline discipline;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNationalTask() {
        return nationalTask;
    }

    public void setNationalTask(String nationalTask) {
        this.nationalTask = nationalTask;
    }

    public String getProvincialTask() {
        return provincialTask;
    }

    public void setProvincialTask(String provincialTask) {
        this.provincialTask = provincialTask;
    }

    public String getDirectProject() {
        return directProject;
    }

    public void setDirectProject(String directProject) {
        this.directProject = directProject;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }
}
