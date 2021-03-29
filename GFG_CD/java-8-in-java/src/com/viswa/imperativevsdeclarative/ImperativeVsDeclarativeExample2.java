package com.viswa.imperativevsdeclarative;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;


public class ImperativeVsDeclarativeExample2 {

	public static void main(String[] args) {

		
		List<Integer> l=Arrays.asList(1,2,3,3,4,5,6,6,7,8,8,9);
		
		//Imperative style
		
		List<Integer> removedupliactes=new ArrayList<>();
		for(Integer i:l) {
			if(!removedupliactes.contains(i)) {
				removedupliactes.add(i);
				
			}
		}
		System.out.println(removedupliactes);
		
		
		//declarative style
		List<Integer> l1=l.stream().distinct().collect(Collectors.toList());
		System.out.println(l1);
		
	}

}
