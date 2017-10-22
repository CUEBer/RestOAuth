package edu.cueb.degree.model;

import javax.persistence.*;

@Entity
public class TutorGuidance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 5)
    private String newMasterToturNumber;
    @Column(length = 5)
    private String newDoctorTutorNumber;
    @Column(length = 5)
    private String tutorAssessExcellence;
    private String totorAssessDisqualification;
    @OneToOne
    private Discipline discipline;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNewMasterToturNumber() {
        return newMasterToturNumber;
    }

    public void setNewMasterToturNumber(String newMasterToturNumber) {
        this.newMasterToturNumber = newMasterToturNumber;
    }

    public String getNewDoctorTutorNumber() {
        return newDoctorTutorNumber;
    }

    public void setNewDoctorTutorNumber(String newDoctorTutorNumber) {
        this.newDoctorTutorNumber = newDoctorTutorNumber;
    }

    public String getTutorAssessExcellence() {
        return tutorAssessExcellence;
    }

    public void setTutorAssessExcellence(String tutorAssessExcellence) {
        this.tutorAssessExcellence = tutorAssessExcellence;
    }

    public String getTotorAssessDisqualification() {
        return totorAssessDisqualification;
    }

    public void setTotorAssessDisqualification(String totorAssessDisqualification) {
        this.totorAssessDisqualification = totorAssessDisqualification;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }
}
