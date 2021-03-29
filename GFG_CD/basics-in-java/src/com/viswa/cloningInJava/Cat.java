package com.viswa.cloningInJava;

public class Cat implements Cloneable{
   public int x;
   public int y;
@Override
protected Object clone() throws CloneNotSupportedException {
	return super.clone();
}
@Override
public String toString() {
	return "Cat [x=" + x + ", y=" + y + "]";
}
   
   
}
