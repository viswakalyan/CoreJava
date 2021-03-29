package com.viswa.hashmapExample01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx01 {

	public static void main(String[] args) {

		HashMap<String,String> hm= new HashMap<>();
		hm.put("a", "A");
		hm.put("b", "B");
		hm.put("c", "C");
		hm.put("d", "D");
		Set<String> s= hm.keySet();
		System.out.println(hm);
		System.out.println(s);
		Set<Map.Entry<String, String>> se=hm.entrySet();
		System.out.println(se);
		Iterator<Map.Entry<String, String>> iterator= se.iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, String> me=iterator.next();
			System.out.println(me.getKey()+"    "+me.getValue());
		}
		
	}

}
