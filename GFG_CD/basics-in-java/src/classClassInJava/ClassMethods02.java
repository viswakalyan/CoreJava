package classClassInJava;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMethods02 {

	public static void main(String[] args) throws ClassNotFoundException {

		Class c1= Class.forName("java.lang.String");
		Class c2=Class.forName("java.lang.Runnable");
		System.out.println(c1.isInterface());
		System.out.println(c2.isInterface());
		
		
		Class c3= Class.forName("java.lang.String");
		Class c4=int.class;
		System.out.println(c3.isPrimitive());
		System.out.println(c4.isPrimitive());
		
		int[] a= {10,20,30};
		System.out.println(a.getClass().isArray());
		
		
		//isAnonymousClass(),  isLocalClass(), isMemberClass() , isEnum()
		
		//If this Class represents either the Object class, an interface, a primitive type, or void, then null is returned.
		Class c5=Class.forName("java.lang.String");
		Class c6=Class.forName("java.lang.Object");
		System.out.println(c5.getSuperclass());
		System.out.println(c6.getSuperclass());
		System.out.println(a.getClass().getSuperclass());
		
		
		Class c7 = Class.forName("java.lang.String"); 
		Class c7Interfaces[] = c7.getInterfaces();
		for (Class class1 : c7Interfaces)  
        { 
            System.out.println(class1); 
        } 
		
		
		Class c8 = Class.forName("java.lang.String"); 
        Class c9 = Class.forName("java.util.ArrayList");
        System.out.println(c8.getPackage());
        System.out.println(c9.getPackage());
        
        //returns all public fields
        Class c10 = Class.forName("java.lang.Integer");
        Field f[]=c10.getFields();
		for (Field field : f) {
			System.out.println(field);
		}
		
		//returns all public methods
		Class c11=Class.forName("java.lang.Object");
		Method[] m = c11.getMethods();
		for (Method method : m) {
			System.out.println(method);
		}
		
		//returns all public constructors
		Class c12 = Class.forName("java.lang.Boolean");
		Constructor[] cons=c12.getConstructors();
		for (Constructor constructor : cons) {
			System.out.println(constructor);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
