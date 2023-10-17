package com.sunbeam;

import java.util.Arrays;

public class Minimum_Number {

	static <T extends Number> T findMin(T[] arr) {
		T min = arr[0];
		for (T t : arr) {
		if(t.doubleValue()<min.doubleValue())
			min=t;
		}
		return min;

		// your logic
		}

	public static void main(String[] args) {

		Integer[] arr1 = { 22, 55, 77, 11, 33 };
		Integer min1 = findMin(arr1);
		System.out.println(min1);

		Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		Double min2 = findMin(arr2);
		System.out.println(min2);

	}

}
