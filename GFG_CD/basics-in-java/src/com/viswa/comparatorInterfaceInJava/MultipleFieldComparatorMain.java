package com.viswa.comparatorInterfaceInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MultipleFieldComparatorMain  {

	public static void main(String[] args) {
		// create ArrayList to store Student
        List<Student> al= new ArrayList<>();
 Object obj= new Object();
        // create customer objects using constructor initialization
        Student obj1 = new Student("Ajay", 27);
        Student obj2 = new Student("Sneha", 23);
        Student obj3 = new Student("Simran", 37);
        Student obj4 = new Student("Ajay", 22);
        Student obj5 = new Student("Ajay", 29);
        Student obj6 = new Student("Sneha", 22);
        
        al.add(obj1);
        al.add(obj2);
        al.add(obj3);
        al.add(obj4);
        al.add(obj5);
        al.add(obj6);
        for (Student student : al) {
			System.out.println(student);
		}
        Collections.sort(al, new MyMultipleFieldComparator());
        System.out.println("--------------------------------------------");
        for (Student student : al) {
			System.out.println(student);
		}
        
        
	}

}
