package edu.cueb.degree.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AcademicReport {
    @Id
    @Column(length = 5)
    private String id;
    @Column(length = 50)
    private String reportname;
    @Column(length = 20)
    private String speaker;
    @Column(length = 20)
    private String speakerschool;
    @Column(length = 20)
    private String holdtime;
    @Column(length = 5)
    private String audienceamount;
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

    public String getReportname() {
        return reportname;
    }

    public void setReportname(String reportname) {
        this.reportname = reportname;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public String getSpeakerschool() {
        return speakerschool;
    }

    public void setSpeakerschool(String speakerschool) {
        this.speakerschool = speakerschool;
    }

    public String getHoldtime() {
        return holdtime;
    }

    public void setHoldtime(String holdtime) {
        this.holdtime = holdtime;
    }

    public String getAudienceamount() {
        return audienceamount;
    }

    public void setAudienceamount(String audienceamount) {
        this.audienceamount = audienceamount;
    }
}
