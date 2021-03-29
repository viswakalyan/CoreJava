package StringBufferInJava;

public class StringBufferMethods01 {

	public static void main(String[] args) {
		
		StringBuffer sb1= new StringBuffer("viswa");
		
		System.out.println(sb1.length());
		
		System.out.println(sb1.capacity());
		
		System.out.println(sb1.charAt(3));
		
		//System.out.println(sb1.charAt(10)); //java.lang.StringIndexOutOfBoundsException
		
		sb1.setCharAt(0, 'V');
		System.out.println(sb1);
		
		sb1.append("Kalyan");
		System.out.println(sb1);
		
		sb1.append('P');
		System.out.println(sb1);
		
		sb1.append(7);//int,long,float,double,boolean
		System.out.println(sb1);
		
		char[] chArr= {' ','D','h','a','n','u'};
		sb1.append(chArr);
		System.out.println(sb1);
		

	}

}
