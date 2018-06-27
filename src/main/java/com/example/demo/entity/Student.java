package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String lastname;
    private String course;
    private String specialty;
    private int attendance; //посещаемость
    private int acperformance; //успеваемость

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCourse() {
        return course;
    }

    public String getSpecialty() {
        return specialty;
    }

    public int getAttendance() {
        return attendance;
    }

    public int getAcperformance() {
        return acperformance;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public void setAcperformance(int acperformance) {
        this.acperformance = acperformance;
    }
}
