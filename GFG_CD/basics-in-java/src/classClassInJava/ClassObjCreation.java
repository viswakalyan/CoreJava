package classClassInJava;

public class ClassObjCreation {

	public static void main(String[] args) throws ClassNotFoundException {

		//1st type by passing at run time
		Class c1=Class.class.forName("java.lang.String");
		System.out.println(c1.getName());
		
		//by using object
		String str= new String("viswa");
		System.out.println(str.getClass().getName());
		
		//at compile time
		Class c2=String.class;
		System.out.println(c2.getName());
	}

}
