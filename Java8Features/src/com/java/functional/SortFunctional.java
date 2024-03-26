package com.java.functional;

import java.util.Arrays;

public class SortFunctional {

	public static void main(String args[])
	{
		Integer[] arr = new Integer[] {54,432,53,21,43};

		/*
		 * Sorting in descending order
		 */
		Arrays.sort(arr, ( obj1,  obj2) -> obj2.compareTo(obj1));
		Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
		
	}
}
