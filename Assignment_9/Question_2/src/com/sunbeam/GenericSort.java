package com.sunbeam;

import java.util.Comparator;

public class GenericSort {

	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		In main(), create array of Double and sort it by calling selectionSort().
		Double[] arr = { 10.1, 10.2, 10.3, 10.4 };
		
		// local class
		class DoubleComparator implements Comparator<Double>{
			@Override
			public int compare(Double arg0, Double arg1) {
				// TODO Auto-generated method stub
				
				return Double.compare(arg0, arg1);
			}
		}
		
		DoubleComparator dc = new DoubleComparator();
		selectionSort(arr, dc);
		
		for (Double double1 : arr) {
			System.out.println(double1);
		}

	}

}
