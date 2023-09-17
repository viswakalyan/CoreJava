package com.viswa.ArrayListBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Ex01 {
//comment
	public static void main(String[] args) {

		// constructor
		ArrayList<String> al = new ArrayList<>();

		// adding elements to list
		al.add("viswa");
		al.add("kalyan");
		al.add("siva");
		al.add("suresh");
		System.out.println("-----------------------------------------");
		// displaying all the elements
		System.out.println(al);
		System.out.println("-----------------------------------------");
		// adding element at a specific index
		al.add(1, "Dhanusha");
		System.out.println(al);
		System.out.println("-----------------------------------------");
		// foreach to get each element
		for (String str : al) {
			System.out.println(str);
		}
		System.out.println("-----------------------------------------");
		// get method to get element at a perticular index
		String str1 = al.get(1);
		System.out.println(str1);
		System.out.println("-----------------------------------------");

		al.add("viswa");
		System.out.println(al);

		// to remove an object ,if there are duplicates like viswa here , it will remove
		// the 1st occurance
		al.remove("viswa");
		System.out.println(al);
		System.out.println("-----------------------------------------");
		// to remove element at a specific index
		al.remove(3);
		System.out.println(al);
		System.out.println("-----------------------------------------");
		// to add other collect to the list
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("narayana");
		al2.add("vijaya");
		al2.add("harika");
		System.out.println("before adding list: " + al);
		al.addAll(al2);
		System.out.println("after adding list: " + al);
		System.out.println("-----------------------------------------");
		// to add other collect to the list at a specific index
		al.addAll(1, al2);
		System.out.println(al);
		System.out.println("-----------------------------------------");
		// clear the list
		System.out.println(al2);
		al2.clear();
		System.out.println(al2);
		System.out.println("-----------------------------------------");

		boolean flag = al.contains("viswa");
		System.out.println(flag);
		System.out.println("-----------------------------------------");

		boolean flag2 = al2.isEmpty();
		System.out.println(flag2);
		System.out.println("-----------------------------------------");

		int index = al.indexOf("vijaya");
		System.out.println(index);
		System.out.println("-----------------------------------------");

		int lastindex = al.lastIndexOf("vijaya");
		System.out.println(lastindex);
		System.out.println("-----------------------------------------");

		ListIterator<String> ltr = al.listIterator();
		while (ltr.hasNext()) {
			System.out.print(ltr.next() + "  ");
		}
		System.out.println();
		System.out.println("-----------------------------------------");

		ListIterator<String> ltr2 = al.listIterator(3);
		while (ltr2.hasNext()) {
			System.out.print(ltr2.next() + "  ");
		}
		System.out.println();
		System.out.println("-----------------------------------------");

		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("narayana");
		al3.add("vijaya");
		al3.add("harika");
		System.out.println(al);
		al.removeAll(al3);
		System.out.println(al);

		System.out.println("-----------------------------------------");
		ArrayList<String> bags = new ArrayList<String>();
		bags.add("pen");
		bags.add("pencil");
		bags.add("paper");
		ArrayList<String> boxes = new ArrayList<String>();
		boxes.add("pen");
		boxes.add("paper");
		boxes.add("books");
		boxes.add("rubber");
		System.out.println(bags);
		System.out.println(boxes);
		boxes.retainAll(bags);
		System.out.println(boxes);
		System.out.println("-----------------------------------------");

		ArrayList<Integer> list1 = null;
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("pen");
		list2.add("paper");
		list2.add("books");
		list2.add("rubber");

		// list2.retainAll(list1); //java.lang.NullPointerException

		System.out.println(list2.size());
		// System.out.println(list1.size()); //java.lang.NullPointerException

		List<String> list3 = list2.subList(1, 3);
		System.out.println(list3);
		// List<String> arrlist2 = list2.subList(2, 7);
		// //java.lang.IndexOutOfBoundsException
		// List<String> arrlist3 = list2.subList(7, 2);
		// //java.lang.IllegalArgumentException

		System.out.println(list2);

		Object[] objArr = list2.toArray();
		System.out.println(objArr[2]);

		String[] strArr = new String[list2.size()];
		strArr = list2.toArray(strArr);
		System.out.println(strArr[2]);

		ArrayList<Integer> arr = new ArrayList<Integer>(9);
		arr.add(2);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(11);
		// trims the size to the number of elements
		arr.trimToSize();
		System.out.println(arr);
		arr.add(3,null);
		arr.add(1,null);
		System.out.println(arr);
		
		//synchronised list
		List<Integer> l1= Collections.synchronizedList(arr);
		System.out.println(l1);
		
		

	}

}
