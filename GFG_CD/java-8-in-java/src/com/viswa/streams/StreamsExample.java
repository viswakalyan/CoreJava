package com.viswa.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.viswa.data.Student;
import com.viswa.data.StudentDataBase;

public class StreamsExample {
	
	 public static void main(String[] args) {

	        //student name and there activities in a map
		 Predicate<Student> studentPredicate = (student -> student.getGradeLevel()>=3);
	        Predicate<Student> studentgpaPredicate = (student -> student.getGpa()>=3.9);


	        Map<String,List<String>> studentMap = StudentDataBase.getAllStudents().parallelStream()
	                .filter(studentPredicate)
	                .filter(studentgpaPredicate)
	                .collect(Collectors.toMap(Student::getName,Student::getActivities));

	        System.out.println(studentMap); 
		 
	 }

}
