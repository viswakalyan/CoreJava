package com.viswa.streams_terminal;

import java.util.stream.Collectors;

import com.viswa.data.StudentDataBase;

public class StreamsCountingExample {

	 public static long count(){

	        return StudentDataBase.getAllStudents()
	                .stream()
	                .filter(student -> student.getGpa()>=3.9)
	               // .count();
	                .collect(Collectors.counting());
	    }

	    public static void main(String[] args) {

	        System.out.println(count());
	    }
}
