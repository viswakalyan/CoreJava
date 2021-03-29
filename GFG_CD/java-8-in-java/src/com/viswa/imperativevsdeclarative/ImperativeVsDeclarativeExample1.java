package com.viswa.imperativevsdeclarative;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {

    public static void main(String[] args) {
    	
    	

        int sum=IntStream.rangeClosed(0, 100).sum();
        System.out.println("sum is :"+sum);

    }

}

