package com.example.demo.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class

public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String lastname;
    private String department;
    private String load; //нагрузка

    private Set<Timetable> timetables = new HashSet<Timetable>() {
    };

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tablename")
    public Set<Timetable> getTimetables() {
        return timetables;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDepartment() {
        return department;
    }

    public String getLoad() {
        return load;
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

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setLoad(String load) {
        this.load = load;
    }
}
