package com.viswa.LinkedHashSetExample;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LHSExample01 {

	public static void main(String[] args) {
		LinkedHashSet<String> hs= new LinkedHashSet<>();
		hs.add("viswa");
		hs.add("kalyan");
		hs.add("siva");
		boolean flag= hs.add("viswa");
		System.out.println(flag);
		hs.add(null);
		System.out.println(hs);

	}

}
