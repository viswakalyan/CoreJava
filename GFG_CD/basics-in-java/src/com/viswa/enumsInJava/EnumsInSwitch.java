package com.viswa.enumsInJava;

public class EnumsInSwitch {
	
	Color color;
	
	

	public EnumsInSwitch(Color color) {
		super();
		this.color = color;
	}



	public static void main(String[] args) {
		EnumsInSwitch obj= new EnumsInSwitch(Color.RED);
		
		switch(obj.color) {
		case BLUE :
			System.out.println("Blue");
			break;
		case RED :
			System.out.println("RED COLOR");
			break;
			
		default :
			System.out.println("other color");
		}
		
		
		
	}

}
