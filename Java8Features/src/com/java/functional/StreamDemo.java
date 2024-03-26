package com.java.functional;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String args[])
	{
		List<Integer> list = Arrays.asList(5,8,9,2,3,4,9,3,1);
		list.stream().sorted((ob1,ob2)-> ob2.compareTo(ob1)).forEach(a-> System.out.print(a + " "));
		
	}
}
