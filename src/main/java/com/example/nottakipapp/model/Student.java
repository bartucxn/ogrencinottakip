package com.example.nottakipapp.model;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private double exam1; 
    private double exam2;

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }
    public double getExam1() { return exam1; }
    public void setExam1(double exam1) { this.exam1 = exam1; }
    public double getExam2() { return exam2; }
    public void setExam2(double exam2) { this.exam2 = exam2; }

    @Transient
    @JsonProperty("average")
    public double getAverage() {
        return exam1 * 0.4 + exam2 * 0.6;
    }

    @Transient
    @JsonProperty("passed")
    public boolean isPassed() {
        return getAverage() >= 60;
    }
}
