package com.viswa.cloningInJava;

public class SimpleClone {

	public static void main(String[] args) {

		Cat c1= new Cat();
		c1.x=20;
		c1.y=30;
		Cat c2=null;
		try {
			c2= (Cat)c1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c1.x +" "+c1.y+" "+c2.x+" "+c2.y);
		
	}

}
