package BigIntegerInJava;

import java.math.BigInteger;

public class BigInteger01 {

	public static void main(String[] args) {

		//converting int to BigInteger
		int a=89;
		BigInteger b= BigInteger.valueOf(89);
		System.out.println(b);
		
		
		//converting String to BigInteger
		String str="56";
		BigInteger c=new BigInteger(str);
		System.out.println(c);
		
		//constants
		BigInteger d= BigInteger.ONE;
		BigInteger e= BigInteger.ZERO;
		BigInteger f= BigInteger.TEN;
		
		BigInteger g= b.add(c);
		System.out.println("after adding: "+b);
		System.out.println(g);
		
		BigInteger h=b.subtract(c);
		System.out.println(h);
		
		BigInteger i= b.multiply(c);
		System.out.println(i);
		
		BigInteger j= b.divide(c);
		System.out.println(j);
		
		BigInteger l= b.remainder(c);
		System.out.println(l);
		
		BigInteger j1= c.divide(b);
		System.out.println(j1);
		
		BigInteger l1= c.remainder(b);
		System.out.println(l1);
		
		
		//converting BigInteger to int or long if the value is in range
		int m=b.intValue();
		System.out.println(m);
		
		//converting BigInteger to string
		String str2=b.toString();
		System.out.println(str2);
		
		
		//comparision
		if(b.compareTo(c)>0) {
			
			System.out.println("b greater than c");
		}else if(b.compareTo(c)<0) {
			System.out.println("b lessthan c");
		}else {
			System.out.println("Both b and c are equal");
		}
		
		//otherway to check for equality is
		if(b.equals(c)) {
			System.out.println("equals");
		}else {
			System.out.println("not equal");
		}
		
		//abs()
		BigInteger n= new BigInteger("-345678");
		BigInteger o=n.abs();
		System.out.println(n);
		System.out.println(o);
		
		//max()
		 BigInteger val1=new BigInteger("8976543245"); 
	      BigInteger val2=new BigInteger("9248040402");
	      BigInteger big= val1.max(val2);
	      System.out.println(big);
	      BigInteger small= val1.min(val2);
	      System.out.println(small);
	      
		
	      BigInteger b1= new BigInteger("321456"); 
	        int exponent = 5; 
	        BigInteger result=b1.pow(5);
	        System.out.println(result);
	        
	        
	       //b1.sqrt() method is present in java9 but not in java8
	        
	        
		
	}

}
