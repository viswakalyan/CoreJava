package com.viswa.ArrayListBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample01 {

	public static void main(String[] args) {

		
		ArrayList<String> al= new ArrayList<String>();
		al.add("viswa");
		al.add("siva");
		al.add("kalyan");
		Iterator<String> itr= al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		System.out.println(al);
		
	}

}
