package com.java.functional;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String args[] ) {
		Predicate<Integer> predicate = (i) -> i%2==0;
		System.out.println("Number is even " + predicate.test(5));
	}
}
