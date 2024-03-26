package com.java.functional;

@FunctionalInterface
interface Calculator {
	void switchOn();
}

public class CalculatorImpl {

	public static void main(String args[])
	{
		Calculator calculate = () -> System.out.println("Calculator switchedOn");
		calculate.switchOn();
	}
}
