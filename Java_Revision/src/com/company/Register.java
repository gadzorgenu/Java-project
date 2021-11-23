package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Register  {
//    private List<Nameable> names;
    private List<Student> students;


//    public Register(List<Nameable> names) {
//        this.names = names;
//    }
//
    public Register(List<Student> students){
        this.students = students;
    }

    public List<Student> getStudentByName(String name) throws StudentNotFoundException {
        List<Student> s = students.stream().filter(student -> student.getName() == name).collect(Collectors.toList());
        if (s.isEmpty()){
            throw new StudentNotFoundException("Student not found with the given name");
        }
        return s;
    }

    public Map<Year, List<Student>> getRegisterByLevel(Year year){
        var result =  students.stream().filter(student -> student.getYear() ==year).collect(Collectors.toList());
        Map<Year, List<Student>> mapyear = new HashMap<>();
        mapyear.put(year, result);

        return mapyear;
    }

    public List<Student> sort(Comparator<Student> studentComparator){
       return students.stream().sorted(studentComparator).collect(Collectors.toList());
    }

    public double getHighestAverageGrade(){
        return students.stream().mapToDouble(Student::getAverageGrade).max().getAsDouble();
    }

    public List<Double> getStudentsAverageGrades(){
        return students.stream().map(Student::getAverageGrade).collect(Collectors.toList());
    }

    public List<Double> passStudents(){
        return students.stream()
                .map(student -> student.getGrades().stream()
                        .filter(grade -> grade > 60.0)
                        .collect(Collectors.toList()))
                .collect(Collectors.toList())
                .stream().flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public Optional<Student> getStudentName(String name){
        List<Student> s = students.stream().filter(student -> student.getName() == name).collect(Collectors.toList());
        if (s.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(s.get(0));
    }

    public List<Student> getStudentsByName(List<String> names){
        return students.stream().filter(student -> names.contains(student.getName())).collect(Collectors.toList());
    }


    public List<Student> getStudents() {
        return students;
    }







//    public  String PrintReport(){
//        return "Register By Level{" +
//                "students=" + getRegister() +
//                '}';
//    }

}


//    public  List<Student> getRegisterByLevel(Year year){
//        return students.stream().filter(s -> s.getYear() == year).collect(Collectors.toList());
//    }


//    public List<String> getRegister(){
//        return names.stream().map(Nameable::getName).collect(Collectors.toList());
//    }

