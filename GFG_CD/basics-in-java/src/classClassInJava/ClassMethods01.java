package classClassInJava;

public class ClassMethods01 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		//toString method
		Class c1=Class.forName("java.lang.String");
		Class c2=int.class;
		Class c3=void.class;
		Class c4=Runnable.class;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		System.out.println("=========================================");
		//newInstance
		Class c5=Class.forName("java.lang.String");
		Object obj=c5.newInstance();
		String str=(String)obj;
		System.out.println(str.getClass().getName());
		System.out.println("=========================================");
	
		//instanceOf
		String str2="viswa";
		System.out.println(str2 instanceof String);
		System.out.println("=========================================");
		
		//isInstance
		Class c6=Class.forName("java.lang.String");
		String str3="viswa";
		System.out.println(c6.isInstance(str3));
		System.out.println("=========================================");
		
		
	}

}
