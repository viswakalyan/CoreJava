package com.viswa.genericInterface;

public class GenericInterfaceExample {

	public static void main(String[] args) {

		Pair<Integer,String> p1= new OrderedPair<Integer, String>(10, "apple");
		Pair<String,Integer> p2= new OrderedPair<String, Integer>("banana", 12);
		
		System.out.println(p1.getValue());
		print(p1.getKey(),p1.getValue());
		
	}
	
	public static <K,V> void print(K key,V value) {
		System.out.println("key: "+key);
		System.out.println("value: "+value);
	}

}
