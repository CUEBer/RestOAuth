package edu.cueb.degree.model;

public class Meeting {
    private String name;
    private String meetingName ;
    private String time;
    private String title;
    public Meeting(String name, String meetingName, String time, String title) {
        super();
        this.name = name;
        this.meetingName = meetingName;
        this.time = time;
        this. title =  title;
    }

    public String getName() {
        return name;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public String getTime() {
        return time;
    }

    public String getTitle() {
        return title;
    }
}
