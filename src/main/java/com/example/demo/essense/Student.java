package com.example.demo.essense;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class

public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String  name;
    private String  lastname;
    private String  course;
    private String  specialty;
    private String  attendance; //посещаемость
    private String  acperformance; //успеваемость

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

    public String getAttendance() {
        return attendance;
    }

    public String getAcperformance() {
        return acperformance;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
