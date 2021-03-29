package com.viswa.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStream {

	  public static void main(String[] args) {

	        ArrayList<String> names = new ArrayList<>();
	        names.add("adam");
	        names.add("jim");
	        names.add("jenny");

	        for(String name : names){
	            System.out.println(name);
	        }
System.out.println("=========================================");
	        for(String name : names){
	            System.out.println(name);
	        }
	        System.out.println("=========================================");
	        names.remove(0);

	        System.out.println(names);
	        System.out.println("=========================================");
	        Stream<String> nameStream = names.stream();
	        nameStream.forEach(System.out::println);
	       // nameStream.forEach(System.out::println);
	        System.out.println("=========================================");

	    }
}
