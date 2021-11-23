package com.company;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private Lecturer lecturer;
    private List<Student> students;
    private Year year;

    public Course(Lecturer lecturer, List<Student> students, Year year) {
        this.lecturer = lecturer;
        this.students = students;
        this.year = year;
    }


    public void addStudents(List<Student> studentList) {
        this.students = studentList;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Course{" +
                " lecturer=" + lecturer +
                ", students=" + students +
                ", year=" + year +
                '}';
    }
}
