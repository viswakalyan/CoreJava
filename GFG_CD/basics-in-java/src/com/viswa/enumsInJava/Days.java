package com.viswa.enumsInJava;

public enum Days {
 MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY,SUNDAY;
	
	private Days() {
		System.out.println(this.toString());
	}
	
	public void colorinfo() {
		System.out.println("Universal Color");
	}
}
