package com.example.demo.entity;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "students")
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

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "lastname")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Column(name = "course")

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Column(name = "specialty")

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Column(name = "attendance")

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    @Column(name = "acperformance")

    public int getAcperformance() {
        return acperformance;
    }

    public void setAcperformance(int acperformance) {
        this.acperformance = acperformance;
    }
}
