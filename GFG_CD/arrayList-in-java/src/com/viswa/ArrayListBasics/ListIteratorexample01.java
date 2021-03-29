package com.viswa.ArrayListBasics;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorexample01 {

	public static void main(String[] args) {

		ArrayList<String> al= new ArrayList<>();
		al.add("viswa");
		al.add("siva");
		al.add("kalyan");
		ListIterator<String> lItr= al.listIterator();
		if(lItr.hasNext()) {
			System.out.println(lItr.next());
		}
		if(lItr.hasPrevious()) {
			System.out.println(lItr.previous());
		}
		lItr.set("OMG");
		System.out.println(al);
		
	}

}
