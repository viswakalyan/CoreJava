package com.viswa.cloningInJava;

public class DeepClone {

	public static void main(String[] args) {

		Dog d = new Dog();
		Cat c1= new Cat();
		c1.x=99;
		c1.y=98;
		d.c=c1;
		d.name="aaaa";
		d.a=67;
		Dog d2=null;
		try {
		 d2=(Dog)d.clone();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(d);
		System.out.println(d2);
		System.out.println(d.c==d2.c);
	}

}
