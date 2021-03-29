package com.viswa.comparatorInterfaceInJava;

public class Student {

	private Integer age;
	private String name;
	private String address;
	public Student(Integer age, String name, String address) {
		super();
		this.age = age;
		this.name = name;
		this.address = address;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", address=" + address + "]";
	}
	public Student(String name,Integer age) {
		super();
		this.age = age;
		this.name = name;
	}
	
	
}
