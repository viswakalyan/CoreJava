package com.viswa.stackbasics;
 import java.util.Stack;
public class SExample01 {
	
	public static void main(String[] args) {
		Stack<String> stack= new Stack<String>();
		stack.push("viswa");
		stack.push("kalyan");
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.isEmpty());
		System.out.println(stack.empty());
	}

}
