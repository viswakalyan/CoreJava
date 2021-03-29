package com.viswa.vectorBasics;
import java.util.Vector;
import java.util.Enumeration;
public class Vectorexample01 {

	public static void main(String[] args) {

		Vector<String> vector= new Vector<String>();
		vector.add("viswa");
		vector.add("siva");
		vector.add("kalyan");
		Enumeration<String> enumeration=vector.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}

}
