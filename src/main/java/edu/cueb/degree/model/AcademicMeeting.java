package edu.cueb.degree.model;

import javax.persistence.*;

@Entity
public class AcademicMeeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 50)
    private String meetingName;
    @Column(length = 20)
    private String meetingTime;
    @Column(length = 6)
    private String totalPerson;
    @Column(length = 6)
    private String Foreigner;
    @OneToOne
    private Discipline discipline;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }

    public String getMeetingTime() {
        return meetingTime;
    }

    public void setMeetingTime(String meetingTime) {
        this.meetingTime = meetingTime;
    }

    public String getTotalPerson() {
        return totalPerson;
    }

    public void setTotalPerson(String totalPerson) {
        this.totalPerson = totalPerson;
    }

    public String getForeigner() {
        return Foreigner;
    }

    public void setForeigner(String foreigner) {
        Foreigner = foreigner;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }
}
