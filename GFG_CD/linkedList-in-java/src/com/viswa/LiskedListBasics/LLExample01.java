package com.viswa.LiskedListBasics;

import java.util.LinkedList;

public class LLExample01 {

	public static void main(String[] args) {

		
		LinkedList<String> l= new LinkedList<String>();
		l.add("viswa");
		l.addFirst("narayana rao");
		l.add(1, "vijaya");
		l.addLast("Dhanusha");
		System.out.println(l);
		String first=l.getFirst();
		String last=l.getLast();
	
		l.addFirst("dfghj");
		l.addLast("ertyu");
		System.out.println(l);
		System.out.println(l.removeFirst());
		System.out.println(l.removeLast());
		System.out.println(l);
		System.out.println(l.peek());
		System.out.println(l.peekFirst());
		System.out.println(l.peekLast());
		System.out.println(l.poll());
		System.out.println(l.pollFirst());
		System.out.println(l.pollLast());
		System.out.println(l);
		System.out.println(l.pop());
		System.out.println(l);
		l.push("viswa");
		System.out.println(l);
		System.out.println(l.remove());
		System.out.println(l);
		System.out.println(l.add("rtyui"));
		l.set(0, "viswa");
		System.out.println(l);
		System.out.println(l.size());
	}

}
