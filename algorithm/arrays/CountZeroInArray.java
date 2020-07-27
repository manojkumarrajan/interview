package com.informatica.alog.sdet;


/*
 * @author marajan
 * 
 * Problem Statement :  Given an array of 1s and 0s which has all 1s first followed by all 0s. 
 * 						Count the number of zeroes in the given array.
 * 
 * Solution: Apply binary search on array. There are two characteristics of the array
 * a.) All 1s are first
 * b.) Only 1s and 0s are present in array.
 * 
 * Get the middle of the array and check if it is 0 and it's previous element is 1. If yes. that's where you want to be.
 * If middle element is 1 that means you need to move right. That means your low will move to mid+1
 * if middle element is 0 but previous element is not 1. You need to move to left. That means your high will be mid-1
 */


public class CountZeroInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 0, 0, 0, 0, 0, 0 };
		int len = arr.length;
		System.out.println("Counts of Zeros is : " + countOnes(arr, len));
	}

	public static int countOnes(int arr[], int len) {
		int first = firstZero(arr, 0, len - 1);

		// If 0 is not present at all, return 0
		if (first == -1)
			return 0;

		return (len - first);
	}

	/*
	 * if 0 is present in arr[] then returns the index of FIRST occurrence of 0 in arr[low..high], otherwise returns -1
	 */
	public static int firstZero(int arr[], int low, int high) {
		if(high >= low){
			int mid = high+low/2;
			if(arr[mid]==0 && arr[mid-1]==1)
				return mid;
			if(arr[mid] == 1)
				return firstZero(arr,(mid +1), high);
			else
				return firstZero(arr, low, (mid-1));
		}
		return -1;
	}
}
