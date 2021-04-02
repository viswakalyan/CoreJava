package com.viswa.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

	 public static Optional<String> ofNullable(){

	        Optional<String> stringOptional =Optional.ofNullable("Hello");
	        return stringOptional;
	    }


	    public static Optional<String> of(){
			// we have to use of method only if the value is assured to have value otherwise it will throw exception
	        Optional<String> stringOptional =Optional.of("Hello");
	        return stringOptional;
	    }

	    public static Optional<String> empty(){

	        return Optional.empty();
	    }

	    public static void main(String[] args) {

	        System.out.println("OfNUllable : " + ofNullable());
	        System.out.println("of : " + of());
	        System.out.println("empty : " + empty());
	    }
}
