package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student;
    @BeforeEach
    void setUp() {
        student = new Student("Gina",9, List.of(80.8,50.6,93.0,65.5),Year.FIRST);
    }
    @Test
    void getAverageGrade() {

        Assertions.assertEquals(72.475, student.getAverageGrade());
    }
}