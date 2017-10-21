package edu.cueb.degree.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PrizeList {
    @Id
    @Column(length = 4)
    private String id;
    @Column(length =100 )
    private String achievementname;
    @Column(length = 20 )
    private String completeperson;
    @Column(length = 100 )
    private String prizename;
    @Column(length = 20 )
    private String prizelevel;
    @Column(length = 30)
    private String certificatenumber;
    @Column(length = 30)
    private String prizetime;
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

    public String getAchievementname() {
        return achievementname;
    }

    public void setAchievementname(String achievementname) {
        this.achievementname = achievementname;
    }

    public String getCompleteperson() {
        return completeperson;
    }

    public void setCompleteperson(String completeperson) {
        this.completeperson = completeperson;
    }

    public String getPrizename() {
        return prizename;
    }

    public void setPrizename(String prizename) {
        this.prizename = prizename;
    }

    public String getPrizelevel() {
        return prizelevel;
    }

    public void setPrizelevel(String prizelevel) {
        this.prizelevel = prizelevel;
    }

    public String getCertificatenumber() {
        return certificatenumber;
    }

    public void setCertificatenumber(String certificatenumber) {
        this.certificatenumber = certificatenumber;
    }

    public String getPrizetime() {
        return prizetime;
    }

    public void setPrizetime(String prizetime) {
        this.prizetime = prizetime;
    }
}
