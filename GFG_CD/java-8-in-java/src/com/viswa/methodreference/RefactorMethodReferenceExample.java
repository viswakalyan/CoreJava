package com.viswa.methodreference;

import java.util.function.Predicate;

import com.viswa.data.Student;
import com.viswa.data.StudentDataBase;

public class RefactorMethodReferenceExample {
	
	 static Predicate<Student> p1 = RefactorMethodReferenceExample::greaterThanGradeLevel;


	    public static boolean greaterThanGradeLevel(Student s){
	        return s.getGradeLevel()>=3;
	    }


	    public static void main(String[] args) {

	        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));

	    }

}
