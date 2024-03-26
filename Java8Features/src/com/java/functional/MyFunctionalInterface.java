package com.java.functional;

public interface MyFunctionalInterface {

	void m1();
	
	default void m2()
	{
		System.out.println("Default mehod-1");
	}

	default void m3()
	{
		System.out.println("Default mehod-2");
	}

	default void m4()
	{
		System.out.println("Default mehod-3");
	}

}
