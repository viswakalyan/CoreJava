package com.viswa.comparatorInterfaceInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingleFieldComparatorMain {

	public static void main(String[] args) {

		 List<Student> ar = new ArrayList<Student>();
	        ar.add(new Student(111, "bbbb", "london"));
	        ar.add(new Student(131, "aaaa", "nyc"));
	        ar.add(new Student(121, "cccc", "jaipur"));
	        
	        for (Student student : ar) {
				System.out.println(student);
			}
	        
	        Collections.sort(ar,new MySingleFieldComparator());
	        
	        for (Student student : ar) {
				System.out.println(student);
			}
	        
	}

}
