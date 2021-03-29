package com.viswa.methodreference;

import java.util.function.Consumer;

import com.viswa.data.Student;
import com.viswa.data.StudentDataBase;

public class ConsumerMethodReferenceExample {
	
	 /**
     * classname::methodName
     */
    static Consumer<Student> c1= System.out::println;

    static Consumer<Student> c2= Student::printListOfActivities;


    public static void main(String[] args) {

        StudentDataBase.getAllStudents().forEach(c1);
        StudentDataBase.getAllStudents().forEach(c2);
    }

}
