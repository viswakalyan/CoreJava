package com.viswa.cloningInJava;

public class Dog implements Cloneable{
	public int a;
	public String name;
	public Cat c;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Dog d = (Dog)super.clone();
		Cat c1= new Cat();
		c1.x=d.c.x;
		c1.y=d.c.y;
		d.c=c1;
		d.name=new String(d.name);
		return d;
	}
	@Override
	public String toString() {
		return "Dog [a=" + a + ", name=" + name + ", c=" + c + "]";
	}
	
	
}
