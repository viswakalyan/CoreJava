package stringTokenizerClassInJava;

import java.util.StringTokenizer;

public class StringTokinizer01 {

	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("viswa software solutions");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
		
		StringTokenizer st1 = new StringTokenizer("viswa,software,solutions",",");
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		
		
		String mydelim = " : "; 
        String mystr = "JAVA : Code : String : Tokenizer : Geeks"; 
        StringTokenizer geeks3 = 
                new StringTokenizer(mystr, mydelim); 
        int count = geeks3.countTokens(); 
        System.out.println("Number of tokens : " + count + "\n");
        while (geeks3.hasMoreElements()) {
        	  
            System.out.println(geeks3.nextElement()); 
    } 
		
		
	}

}
