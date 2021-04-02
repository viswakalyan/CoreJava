package com.viswa.streams_terminal;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.viswa.data.Student;
import com.viswa.data.StudentDataBase;

public class StreamsMappingExample {

	public static void main(String[] args) {


        List<String> namesList = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName,Collectors.toList()));

        System.out.println("namesList : " + namesList);

        Set<String> namesSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName,Collectors.toSet()));

        StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println("namesSet : " + namesSet);

    }

	private static Object toList() {
		// TODO Auto-generated method stub
		return null;
	}
}
