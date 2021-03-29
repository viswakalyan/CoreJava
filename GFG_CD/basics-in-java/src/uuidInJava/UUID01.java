package uuidInJava;

import java.util.UUID;

public class UUID01 {

	public static void main(String[] args) {

		UUID id1= UUID.randomUUID();
		System.out.println(id1);
		System.out.println(id1.version());
		System.out.println(id1.variant());
		
		// generating random UUID from string
		UUID gfg = UUID.fromString("c81d4e2e-bcf2-11e6-869b-7df92533d2db"); 
		
		UUID gfg1 = UUID.randomUUID();
		UUID gfg2 = UUID.randomUUID(); 
		
		
		int compare = gfg1.compareTo(gfg2);
		if(compare==1) 
            System.out.println("gfg1 is greater than gfg2"); 
        else if(compare==0) 
            System.out.println("both are equal"); 
        else
            System.out.println("gfg1 is smaller than gfg2");    
    
	
		
		if(gfg1.equals(gfg2)) 
            System.out.println("both are equal"); 
        else
            System.out.println("both are not same"); 
		
		//only one constructor
		//UUID uuid = new UUID(long mostSignificant64Bits, long leastSignificant64Bits);
		
		
	
	}

}
