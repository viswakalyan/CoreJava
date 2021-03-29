package com.viswa.genericClass;

public class GenericClassExample {

	public static void main(String[] args) {

		Person<Employee> pe= new Person<>();
		Person<Contact> pc=new Person<>();
		
		Employee e=new Employee("viswa", "kalyan", "viswakalyan7@gmail.com");
		Contact c= new Contact("Ms", "Dhanusha", "Viswa", "100");
		pe.setE(e);
		pc.setE(c);
		System.out.println(pe.getE().toString());
		System.out.println(pc.getE().toString());
	}

}
