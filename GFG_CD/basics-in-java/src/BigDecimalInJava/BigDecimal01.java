package BigDecimalInJava;

import java.math.BigDecimal;

public class BigDecimal01 {

	public static void main(String[] args) {

		BigDecimal bd1 =  new BigDecimal("124567890.0987654321"); 
	    BigDecimal bd2 =  new BigDecimal("987654321.123456789"); 
	    BigDecimal bd3=bd1.add(bd2);
	    System.out.println(bd3);
	    BigDecimal bd4= bd1.multiply(bd2);
	    System.out.println(bd4);
	    BigDecimal bd5=bd1.subtract(bd2);
	    System.out.println(bd5);
	    BigDecimal bd6=bd2.pow(2);
	    System.out.println(bd6);
	    BigDecimal bd7=bd6.negate();
	    System.out.println(bd7);
	    
	    
	    //double to BigDecimal
	    double d=12.345;
	    BigDecimal bd8= BigDecimal.valueOf(d);
	    System.out.println(d);
	    
	    //String to BigDecimal
	    String str01="12.345";
	    BigDecimal bd9=new BigDecimal(str01);
	    System.out.println(bd9);
	    
	    BigDecimal bd10=BigDecimal.ONE;
	    BigDecimal bd11=BigDecimal.ZERO;
	    BigDecimal bd12=BigDecimal.TEN;
	    
	    //BigDecimal to double
	    double d1=bd9.doubleValue();
	    System.out.println(d1);
	    
	    //BigDecimal to String
	    String strbd=bd9.toString();
	    System.out.println(strbd);
	    
	    
	    //comparing
	    if(bd10.compareTo(bd11)>0) {
	    	
	    }else if(bd10.compareTo(bd11)<0) {
	    	
	    }else {
	    	
	    }
	    
	    //equals
	    if(bd10.equals(bd11)) {
	    	
	    }
	    
	    
	 
		
	}

}
