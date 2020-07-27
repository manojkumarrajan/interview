package com.informatica.alog.sdet;


/*
 * @author marajan
 * 
 * Find the maximum element in an array which is first increasing and then decreasing
 * Before solving this problem you should see Binary search solution first.
 * This is similar approach to CountZeroInArray.java
 */

public class ArrayIncreasingAndDecreasing {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 50, 10, 9, 7, 6 };
		int n = arr.length;
		System.out.println(findMax(arr));
	}

	public static int findMax(int[] arr) {

		int high = arr.length - 1;
		int low = 0;
		int mid = 0;

		for (int i = 0; low <= high; i++) {
			mid = (low + high) / 2;
			if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1])
				return arr[i];
			else if (arr[mid] < arr[mid + 1])
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}
}
