package com.java.functional;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String args[] ) {
		Consumer<Integer> consumer = (i) -> System.out.println("Square of number is " + i*i );
		consumer.accept(5);
	}
}
