package BigDecimalInJava;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimal02 {

	public static void main(String[] args) {


        BigDecimal b1 = new BigDecimal("456.0"); 
        BigDecimal b2 = new BigDecimal("-1.456"); 
        int i1 = b1.scale(); 
        int i2 = b2.scale();
        System.out.println("The scale of " + b1 + " is " + i1); 
        System.out.println("The scale of " + b2 + " is " + i2); 
        
        
        String str="123.45678493378";
        BigDecimal bd= new BigDecimal(str);
        BigDecimal bd2=bd.setScale(6, RoundingMode.HALF_EVEN);
        System.out.println(bd2);
	}

}
