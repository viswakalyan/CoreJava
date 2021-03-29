package com.viswa.lambdasVariables;

import java.util.function.Consumer;

public class LambdaVariable1 {
	/*
	 * lambdas have some restrictions on local variables
	 * a)not allowed to use the same the local variable name as lambda parameters or inside the lamba body
	 * 
	 * b) not allowed reaassigning a value to a local variable
	 * 
	 * Note: no restrictions on instance variable
	 */
	 public static void main(String[] args) {

	        int i =0;
//here parameter passed in the lambda expression should not be the same as local variable
	        
	        //we caanot declase same local varaible inside lamda body
	        Consumer<Integer> c1 = (i1) -> {

	            System.out.println("Value is : "+ i);
	        };
	    }

}
