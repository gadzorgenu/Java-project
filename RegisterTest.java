package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {
    Register register;

    @BeforeEach
    void setUp() {
        register = new Register(List.of(
                        new Student("Gina", 1,List.of(10.0,10.0) ,Year.FIRST),
                        new NaughtStudent("Adzo", 1,List.of(10.0,10.0) ,Year.FIRST)
                )
        );
    }

    @Test
    void throwStudentNotFoundException() throws StudentNotFoundException {
        assertThrows(StudentNotFoundException.class,() -> register.getStudentByName("Ginaaaa"),"Student not found");
//        assertEquals(List.of("Gina","Adzo"),register.getRegister());
    }

    @Test
    void getStudentByName() throws StudentNotFoundException {
        assertEquals("Gina", register.getStudentByName("Gina").get(0).getName());
    }



}