package com.informatica.alog.sdet;

/*
 *  @author marajan
 *  
 * You have given an array which contain 1 to n element, 
 * your task is to sort this array in an efficient way and without replace with 1 to n numbers
 * 
 * solution :
 * Replace every element with it’s position. it takes O(n) efficient time and give you the sorted array. 
 */


public class SortAnArray {

	
	public static void main(String[] args) {
		int[] arr = { 10, 7, 9, 2, 8, 3, 5, 4, 6, 1 };

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;

		}
		System.out.println();
	}
}
