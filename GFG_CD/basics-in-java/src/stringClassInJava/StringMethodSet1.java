package stringClassInJava;

public class StringMethodSet1 {

	public static void main(String[] args) {

		/*public final class String
		extends Object
		implements Serializable, Comparable<String>, CharSequence*/
		
		String str1="GeeksforGeeks";
		String str2= new String("GeeksforGeeks");
		String str3=new String("GeeksforGeeks");
		String str4=str3.intern();
		System.out.println("str1: "+str1);
		System.out.println("str2: "+str2);
		System.out.println("str3: "+str3);
		System.out.println("str4: "+str4);
		System.out.println(str1==str4);
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		
	}

}
