package com.company;

import java.util.List;

public class NaughtStudent extends Student{

    public NaughtStudent(String name, int studentID, List<Double> grades, Year year) {
        super(name, studentID, grades, year);
    }

    @Override
    public double getAverageGrade() {
        return super.getAverageGrade() * 1.1;
    }


}
