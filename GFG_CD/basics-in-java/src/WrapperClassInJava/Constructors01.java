package WrapperClassInJava;

public class Constructors01 {

	public static void main(String[] args) {

		Integer i= new Integer(10);
		System.out.println(i);
		System.out.println("-------------------------------------");
		Integer i2= new Integer("20");
		System.out.println(i2);
		//Integer i3= new Integer("ten");  //java.lang.NumberFormatException
		
		
		Boolean b= new Boolean("ertyui");
		System.out.println(b);
		
		Boolean b2= new Boolean("trUE");
		System.out.println(b2);
		
		System.out.println(b2.equals(true));
		
		
		Integer i3= Integer.valueOf(99);
		System.out.println(i3.toString());
		
		Integer i4= Integer.valueOf("87");
		System.out.println(i4.toString());
		
		
		Boolean b3= Boolean.valueOf(true);
		System.out.println(b3);
		
		Boolean b4=Boolean.valueOf("sdfgh");
		System.out.println(b4);
		
		Character ch= Character.valueOf('f');
		System.out.println(ch.toString());
		
		System.out.println(i4.intValue());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}

}
