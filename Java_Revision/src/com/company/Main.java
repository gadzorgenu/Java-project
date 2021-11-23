package com.company;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Character> vowels = List.of('a','e','i','o','u');

		Lecturer lect1 = new Lecturer("John Doe", Lect.PROGRAMMING);
		Lecturer lect2 = new Lecturer("John Doe", Lect.PHYSICS);
		Lecturer lect3 = new Lecturer("John Doe", Lect.GARDENING);
		var s1 = new NaughtStudent("Gina", 1,List.of(10.0,10.0) ,Year.FIRST);

		var students = List.of(
				new Student("Gina", 1,List.of(80.8,50.6,93.0,65.5) ,Year.FIRST),
				new Student("Ginaa", 2,List.of(10.8,70.6,83.0,95.5) , Year.FOURTH),
				new Student("Gyna", 3,List.of(20.8,60.6,23.0,45.5) , Year.SECOND),
				new Student("Gee", 4,List.of(10.5,40.6,23.0,45.5) , Year.FIRST),
				new Student("Adz", 5,List.of(20.8,40.6,44.0,45.5) , Year.FOURTH),
				new Student("Geo", 6,List.of(10.85,65.7,55.0,85.5) , Year.SECOND)
		);

		var firstYear = students.stream().filter(s -> s.getYear() == Year.FIRST).collect(Collectors.toList());
		var advanceCourse = students.stream().filter(s -> s.getYear() == Year.THIRD || s.getYear() == Year.FOURTH).collect(Collectors.toList());
		var advancePhys = students.stream().filter(s -> s.getYear() == Year.FOURTH && vowels.contains(s.getName().toLowerCase().charAt(0))).collect(Collectors.toList());


		Course prog = new Course(lect1, firstYear, Year.FIRST);
		Course gard = new Course(lect2, advanceCourse, Year.FOURTH);
		Course phys = new Course(lect3, advancePhys, Year.FOURTH);


//		System.out.println(phys);
//		System.out.println(s1.getAverageGrade());


		var lect = new Lecture(
				List.of(
						new Student("Gina", 1,List.of(10.0,10.0) ,Year.FIRST),
						new NaughtStudent("Gina", 1,List.of(10.0,10.0) ,Year.FIRST)
				)
		);



		var register = new Register(students);
//		System.out.println(register.getRegisterByLevel(Year.FIRST));
//		System.out.println(register.sort(new Sort()));
		System.out.println(register.getStudentName("Gi"));

//		try {
//			System.out.println(register.getStudebtByName("Ginayy"));
//		} catch (StudentNotFoundException e) {
//			e.printStackTrace();
//		}

	}
}











