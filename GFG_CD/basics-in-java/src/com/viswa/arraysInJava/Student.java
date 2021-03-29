package com.viswa.arraysInJava;

public class Student {
	
	private int roll_number;
	private String name;
	public int getRoll_number() {
		return roll_number;
	}
	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int roll_number, String name) {
		super();
		this.roll_number = roll_number;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll_number=" + roll_number + ", name=" + name + "]";
	}
	
	

}
