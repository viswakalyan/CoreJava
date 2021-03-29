package com.viswa.functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

import com.viswa.data.Student;
import com.viswa.data.StudentDataBase;

public class ConsumerExample {

	static Consumer<Student> c1=p->System.out.println(p);
	
	static Consumer<Student> c2=p->System.out.print(p.getName().toUpperCase());
	
	static Consumer<Student> c3= p->System.out.println(p.getActivities());
	
	public static void printName() {
		System.out.println("ConsumerExample.printName()");
		List<Student> students=StudentDataBase.getAllStudents();
		students.forEach(c1);
	}
	
	public static void printNameAndActivities() {
		System.out.println("ConsumerExample.printNameAndActivities()");
		List<Student> students=StudentDataBase.getAllStudents();
		students.forEach(c2.andThen(c3));
	}
	
	public static void printNameAndActivitiesUsingCondition() {
		System.out.println("ConsumerExample.printNameAndActivitiesUsingCondition()");
		List<Student> students=StudentDataBase.getAllStudents();
		
		students.forEach((s)->{
			if( s.getGradeLevel()>=3 && s.getGpa()>3.9){
				c2.andThen(c3).accept(s);
			}
		});
		
		
	}
	
	public static void main(String[] args) {
		Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
		consumer.accept("java8");
		
		printName();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();

	}

}
