package com.company;

import java.util.List;
import java.util.stream.DoubleStream;

public class Student implements Nameable {

    private String name;
    private int studentID;
    private Year year;
    private List<Double> grades;

    public Student(String name, int studentID,List<Double> grades, Year year) {
        this.name = name;
        this.studentID = studentID;
        this.year = year;
        this.grades = grades;
    }

    public double getAverageGrade(){
        return grades.stream().mapToDouble(grade -> grade).average().orElse(0.0);
    }

    public DoubleStream getGrade(){
        return grades.stream().mapToDouble(grade -> grade);
    }

    public String getName() {
        return name;
    }

    public Year getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                ", year=" + year +
                '}';
    }

    public List<Double> getGrades() {
        return grades;
    }
}
