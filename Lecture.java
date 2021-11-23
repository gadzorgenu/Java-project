package com.company;

import java.util.List;

public class Lecture {
    private List<Student> students;

    public Lecture(List<Student> students) {
        this.students = students;
    }

    public  void Enter(Student student){
        students.add(student);
    }

    public double getHighestAverageGrade(){
        return students.stream().mapToDouble(Student::getAverageGrade).max().getAsDouble();
    }
}
