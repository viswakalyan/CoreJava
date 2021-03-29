package com.viswa.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.viswa.data.Student;
import com.viswa.data.StudentDataBase;

public class DebuggingStreamsExample {
	

    public static void main(String[] args) {

        //student name and there activities in a map
        Predicate<Student> studentPredicate = (student -> student.getGradeLevel()>=3);
        Predicate<Student> studentgpaPredicate = (student -> student.getGpa()>=3.9);


        Map<String,List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .peek((student -> {
                    System.out.println(student);
                }))
                .filter(studentPredicate) //Stream<Students>
                .peek((student -> {
                    System.out.println("after 1 st filter " + student);
                }))
                .filter(studentgpaPredicate)//Stream<Students>
                .peek((student -> {
                    System.out.println("after 2 nd filter " + student);
                }))
                .collect(Collectors.toMap(Student::getName,Student::getActivities)); //<Map>

        System.out.println(studentMap);

    }

}
