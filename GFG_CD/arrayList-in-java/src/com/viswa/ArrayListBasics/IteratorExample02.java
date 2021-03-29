package com.viswa.ArrayListBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample02 {

	public static void main(String[] args) {

		
		ArrayList<String> al= new ArrayList<>();
		al.add("viswa");
		al.add("siva");
		al.add("kalyan");
		Iterator<String> itr=al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
			
		}
		System.out.println(al);
	}

}
