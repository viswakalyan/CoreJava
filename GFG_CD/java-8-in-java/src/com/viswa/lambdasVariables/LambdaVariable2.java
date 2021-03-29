package com.viswa.lambdasVariables;

import java.util.function.Consumer;

public class LambdaVariable2 {
	
	static int value =4;

    public static void main(String[] args) {

         //local variable
    	int value1 =7;

        Consumer<Integer> c1 = (i) -> {
            value++;//here its a instance variable so ristrictions in changing the values 
            System.out.println(value+i);
        };

        //value1 =6;//we cannot reassign the values of the local varaibles

        c1.accept(4);

    }

}
