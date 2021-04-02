package com.viswa.streams_terminal;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.viswa.data.Student;
import com.viswa.data.StudentDataBase;

public class StreamGroupingByExample {

	public static void groupStudentsByGender(){

	       Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
	                .stream()
	                .collect(Collectors.groupingBy(Student::getGender));

	        System.out.println(studentMap);
	    }

	    public static void customizedGroupingBy(){

	        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
	                .stream() //Stream<Students>
	                .collect(Collectors.groupingBy(student -> student.getGpa()>=3.8 ? "OUTSTANDING" : "AVERAGE"));

	        System.out.println(studentMap);
	    }

	    public static void twoLevelGrouping_1(){

	        Map<Integer,Map<String,List<Student>>> studentMap = StudentDataBase.getAllStudents()
	                .stream()
	                .collect(Collectors.groupingBy(Student::getGradeLevel,
	                		Collectors.groupingBy(student -> student.getGpa()>=3.8 ? "OUTSTANDING" : "AVERAGE")));

	        System.out.println(studentMap);
	    }

	    public static void twoLevelGrouping_2(){

	        Map<String,Integer> studentMap = StudentDataBase.getAllStudents()
	                .stream()
	                .collect(Collectors.groupingBy(Student::getName,
	                		Collectors.summingInt(Student::getNoteBooks)));

	        System.out.println(studentMap);
	    }
	    
	    public static void threeArgumentGroupBy(){

	        LinkedHashMap<String,Set<Student>> studentLinkedHashmap = StudentDataBase.getAllStudents()
	                 .stream()
	                 .collect(Collectors.groupingBy(Student::getName,LinkedHashMap::new,Collectors.toSet()));

	         System.out.println(studentLinkedHashmap);
	     }
	    
	    public static void calculateTopGpa(){

	        Map<Integer,Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents()
	                .stream()
	                .collect(Collectors.groupingBy(Student::getGradeLevel,
	                		Collectors.maxBy(Comparator.comparing(Student::getGpa))));

	       // System.out.println(studentMapOptional);

	        Map<Integer,Student> studentMapOptional1 = StudentDataBase.getAllStudents()
	                .stream()
	                .collect(Collectors.groupingBy(Student::getGradeLevel,
	                		Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa))
	                        ,Optional::get)));

	        System.out.println(studentMapOptional1);
	    }

	    public static void calculateleastGpa(){

	        Map<Integer,Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents()
	                .stream()
	                .collect(Collectors.groupingBy(Student::getGradeLevel,
	                		Collectors.minBy(Comparator.comparing(Student::getGpa))));

	        // System.out.println(studentMapOptional);

	        Map<Integer,Student> studentMapOptional1 = StudentDataBase.getAllStudents()
	                .stream()
	                .collect(Collectors.groupingBy(Student::getGradeLevel,
	                		Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa))
	                                ,Optional::get)));

	        System.out.println(studentMapOptional1);
	    }
	    
	    
	    
	    public static void main(String[] args) {

	    	// groupStudentsByGender();
	        //customizedGroupingBy();
	        //twoLevelGrouping_1();
	       // twoLevelGrouping_2();
	    	// threeArgumentGroupBy();
	    	//calculateTopGpa();
	        calculateleastGpa();

	    }
}
