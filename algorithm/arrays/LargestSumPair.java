package com.informatica.alog.sdet;

public class LargestSumPair {
	
	/*
	 * @author marajan
	 */

	public static void main(String[] args) {
		int arr[] = { 12, 34, 10, 6, 40 };

		int largest = 0;
		int secLargest = 0;

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > largest){
				secLargest = largest;
				largest = arr[i];
			}
		}
		System.out.println("Largest Sum Pair is :: " + (largest + secLargest));
	}

}
