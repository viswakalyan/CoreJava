package com.viswa.lambdaExample;

import java.util.Comparator;

public class ComparatorLambda {

	public static void main(String[] args) {

		Comparator<Integer> comparator=new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		System.out.println(comparator.compare(3, 2));
		
		Comparator<Integer> comparator2= (Integer a, Integer b)-> a.compareTo(b);
		System.out.println(comparator2.compare(3, 2));
		
		Comparator<Integer> comparator3=(a,b)->a.compareTo(b);
		System.out.println(comparator3.compare(3, 2));
	}

}
