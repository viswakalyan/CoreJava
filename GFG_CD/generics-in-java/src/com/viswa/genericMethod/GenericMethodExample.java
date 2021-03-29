package com.viswa.genericMethod;

public class GenericMethodExample {

	public static void main(String[] args) {

		Integer[] ints= {10, 20, 30, 40, 50, 60, 70, 80};
		String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday",
	            "Friday", "Saturday", "Sunday"};
		
		print(ints);
		print(daysOfWeek);
		System.out.println(countGreaterThan(ints, 50));
		
	}
	
	public static <T extends Comparable<T>> int countGreaterThan(T[] list,T t) {
		int count=0;
		for (T t1 : list) {
			if(t1.compareTo(t)>0) {
				count++;
			}
		}
		return count;
	}
	
	
	public static <E> void print(E[] list) {
		for (E e : list) {
			System.out.print(e +" ");
		}
		System.out.println();
	}

}
