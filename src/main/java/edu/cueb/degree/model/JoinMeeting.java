package edu.cueb.degree.model;

import javax.persistence.*;

@Entity
public class JoinMeeting {
   @Id
   private String id;
   private String lecture;
   private String report;
   private String attendMeeting;
   @Column(columnDefinition ="json")
   @Convert(converter =JpaConverterJson.class )
   private Meeting[] struct;
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

    public String getLecture() {
        return lecture;
    }

    public void setLecture(String lecture) {
        this.lecture = lecture;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getAttendMeeting() {
        return attendMeeting;
    }

    public void setAttendMeeting(String attendMeeting) {
        this.attendMeeting = attendMeeting;
    }

    public Meeting[] getStruct() {
        return struct;
    }

    public void setStruct(Meeting[] struct) {
        this.struct = struct;
    }
}
