package com.viswa.streams_terminal;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.viswa.data.Student;
import com.viswa.data.StudentDataBase;

public class StreamsMinByMaxyByExample {
  
	public static Optional<Student> minBy_example(){

	       return StudentDataBase.getAllStudents()
	                .stream()
	                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	    }

	    public static Optional<Student> maxBy_example(){

	        return StudentDataBase.getAllStudents()
	                .stream()
	                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
	    }

	    public static void main(String[] args) {

	        System.out.println(minBy_example());
	        System.out.println(maxBy_example());
	    }
}
