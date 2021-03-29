package com.viswa.enumsInJava;

public class EnumMethods {

	public static void main(String[] args) {

		//values(), ordinal() and valueOf() methods
		
		Color[] colors=Color.values();
		
		for (Color color : colors) {
			System.out.println(color + " at index "+color.ordinal());
			
		}
		
		System.out.println(Color.valueOf("RED"));
		try {
			System.out.println(Color.valueOf("OMG")); //java.lang.IllegalArgumentException
		} catch (java.lang.IllegalArgumentException e) {
			//e.printStackTrace();
			
			System.out.println("this enum constant does not exist");
		}
		
	}

}
