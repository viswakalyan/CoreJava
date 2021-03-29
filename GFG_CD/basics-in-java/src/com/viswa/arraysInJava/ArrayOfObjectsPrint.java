package com.viswa.arraysInJava;

public class ArrayOfObjectsPrint {

	public static void main(String[] args) {

		Student[] students=new Student[5];
		students[0]= new Student(1, "sai");
		students[1]= new Student(2, "bai");
		students[2]= new Student(3, "mai");
		students[3]= new Student(4, "dai");
		students[4]= new Student(5, "cai");
		
		for(Student student: students) {
			System.out.println(student);
		}
	}

}
