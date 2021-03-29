package com.viswa.hashsetBasics;

import java.util.HashSet;

public class HSExample01 {

	public static void main(String[] args) {

		HashSet<String> hs= new HashSet<>();
		hs.add("viswa");
		hs.add("kalyan");
		hs.add("siva");
		boolean flag= hs.add("viswa");
		System.out.println(flag);
		hs.add(null);
		System.out.println(hs);
	}

}
