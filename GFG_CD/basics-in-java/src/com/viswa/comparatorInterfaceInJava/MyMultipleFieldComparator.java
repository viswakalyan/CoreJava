package com.viswa.comparatorInterfaceInJava;

import java.util.Comparator;

public class MyMultipleFieldComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		int ageComparator= s1.getAge().compareTo(s2.getAge());
		int nameComparator=s1.getName().compareTo(s2.getName());
		if(nameComparator==0) {
			return ageComparator==0?nameComparator:ageComparator;
		}else {
			return nameComparator;
		}
	}
	
	

}
