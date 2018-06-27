package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this  class
public class Timetable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private int timestart;
    private int timeend;
    private String auditoryHall;
    private String subject;

    public Integer getId() {
        return id;
    }

    public int getTimestart() {
        return timestart;
    }

    public int getTimeend() {
        return timeend;
    }

    public String getAuditoryHall() {
        return auditoryHall;
    }

    public String getSubject() {
        return subject;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTimestart(int timestart) {
        this.timestart = timestart;
    }

    public void setTimeend(int timeend) {
        this.timeend = timeend;
    }

    public void setAuditoryHall(String auditoryHall) {
        this.auditoryHall = auditoryHall;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
