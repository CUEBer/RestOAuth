package edu.cueb.degree.model;

import javax.persistence.*;

@Entity
public class Leader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private Discipline discipline;
    @Column(length=10)
    private String name;
    @Column(length=10)
    private String birthdate;
    @Column(length=10)
    private String doctordate;
    @Column(length=10)
    private String technicalposition;
    @Column(length=10)
    private String direction;

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getDoctordate() {
        return doctordate;
    }

    public void setDoctordate(String doctordate) {
        this.doctordate = doctordate;
    }

    public String getTechnicalposition() {
        return technicalposition;
    }

    public void setTechnicalposition(String technicalposition) {
        this.technicalposition = technicalposition;
    }

    ;
}
