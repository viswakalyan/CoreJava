package StringBufferInJava;

import java.util.Arrays;

public class StringBufferMethods02 {

	public static void main(String[] args) {

		StringBuffer sb1= new StringBuffer("Viswa");
		sb1.insert(3,"Dhanusha");//String,char[],char,int,long,float,double,boolean
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(sb1);
		
		sb1.reverse();
		
		sb1.delete(3, 11);
		System.out.println(sb1);
		
		sb1.deleteCharAt(3);
		System.out.println(sb1);
		
		sb1.setLength(2);
		System.out.println(sb1);
		
		sb1.setLength(10);
		System.out.println(sb1);
		System.out.println(sb1.length());
		
		System.out.println(sb1.append("sai"));
		
		System.out.println(sb1.capacity());
		sb1.trimToSize();
		System.out.println(sb1.capacity());
		
		sb1.delete(2, 10);
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer("Geeks For Geeks"); 
		char[] array = new char[15]; 
		// initialize all character to .(dot). 
        Arrays.fill(array, '.'); 
        sb2.getChars(0, 9, array, 1);
        for (int i = 0; i < array.length; i++) { 
            System.out.print(array[i] + " "); 
        } 
        
        System.out.println();
        System.out.println(sb2.indexOf("For"));
        
        System.out.println(sb2.lastIndexOf("Geeks"));
        
        String str1=sb2.substring(10);
        System.out.println(str1);
        
        
        String str2=sb2.substring(0, 5);
        System.out.println(str2);
        
        
	}

}
