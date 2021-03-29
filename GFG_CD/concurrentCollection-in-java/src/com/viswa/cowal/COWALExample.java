package com.viswa.cowal;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWALExample {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> cowal= new CopyOnWriteArrayList<>();
		cowal.add("a");
		cowal.add("b");
		Iterator<String> itr= cowal.iterator();
		cowal.remove(0);
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("--------------");
		System.out.println(cowal);
	}
}
