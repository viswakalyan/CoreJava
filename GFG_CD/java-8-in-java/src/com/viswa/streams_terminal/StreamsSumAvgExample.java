package com.viswa.streams_terminal;

import java.util.stream.Collectors;

import com.viswa.data.Student;
import com.viswa.data.StudentDataBase;

public class StreamsSumAvgExample {

	public static int sum(){

        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.summingInt(Student::getNoteBooks));
    }

    public static double average(){

        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.averagingInt(Student::getNoteBooks));
    }

    public static void main(String[] args) {

        System.out.println("Total No of notebooks : " + sum());

        System.out.println("Average No of notebooks : " + average());
    }
}
