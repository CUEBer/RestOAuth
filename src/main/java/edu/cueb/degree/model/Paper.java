package edu.cueb.degree.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Paper {
    @Id
    @Column(length = 10)
    private String id;
    @Column(length = 10)
    private String firstauthorid;
    @Column(length = 10)
    private String papertype;
    @Column(length = 200)
    private String papertitle;
    @Column(length = 10)
    private String firstauthtype;
    @Column(length = 10)
    private String firstauthor;
    @Column(length = 30)
    private String belongcollege;
    @Column(length = 20)
    private String publishtime;
    @Column(length = 200 )
    private String publishjournals;
    @Column(length = 20)
    private String journaltype;
    @Column(length = 10)
    private String isdelete;

    public String getFirstauthorid() {
        return firstauthorid;
    }

    public void setFirstauthorid(String firstauthorid) {
        this.firstauthorid = firstauthorid;
    }

    public String getPapertype() {
        return papertype;
    }

    public void setPapertype(String papertype) {
        this.papertype = papertype;
    }

    public String getPalertitle() {
        return papertitle;
    }

    public void setPalertitle(String palertitle) {
        this.papertitle = palertitle;
    }

    public String getFirstauthtype() {
        return firstauthtype;
    }

    public void setFirstauthtype(String firstauthtype) {
        this.firstauthtype = firstauthtype;
    }

    public String getFirstauthor() {
        return firstauthor;
    }

    public void setFirstauthor(String firstauthor) {
        this.firstauthor = firstauthor;
    }

    public String getBelongcollege() {
        return belongcollege;
    }

    public void setBelongcollege(String belongcollege) {
        this.belongcollege = belongcollege;
    }

    public String getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(String publishtime) {
        this.publishtime = publishtime;
    }

    public String getPublishjournals() {
        return publishjournals;
    }

    public void setPublishjournals(String publishjournals) {
        this.publishjournals = publishjournals;
    }

    public String getJournaltype() {
        return journaltype;
    }

    public void setJournaltype(String journaltype) {
        this.journaltype = journaltype;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPapertitle() {
        return papertitle;
    }

    public void setPapertitle(String papertitle) {
        this.papertitle = papertitle;
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete;
    }
}
