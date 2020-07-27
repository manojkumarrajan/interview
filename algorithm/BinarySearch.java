package com.informatica.alog.sdet;

/*
 * @author marajan
 * 
 * Search an element in sorted array and print the position if it is found
 * To be remembered : For Binary search always return -1
 */

public class BinarySearch {

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int[] arr = { 5, 6, 7, 8, 9, 10 };
		int key = 10;

		int value = bs.binarySearch(arr, key);
		//int value = bs.binarySearchRecursion(arr, low, high, key);
		
		if (value == -1)
			System.out.println(key + " does not exists in Array");
		else
			System.out.println(key + " exists at Position " + value);
	}

	
	/*
	 * Binary Search Tree Without Recursion
	 * See the difference in the break condition for recursive and non recursive
	 * low<=high and for recursive high < low
	 */
	
	public int binarySearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		int mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;
			if (key == arr[mid])
				return mid;
			else if (key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}	

	/*
	 * Binary Search with recursion
	 * To be remembered : the break point
	 * if (high < low) {
			return -1;
		}
	 * 
	 */
	
	
	public int binarySearchRecursion(int arr[], int low, int high, int key) {
		if (high < low)
			return -1;
		
		int mid = (high + low) / 2;
		if (key == arr[mid])
			return mid;
		
		if (key > arr[mid])
			return binarySearchRecursion(arr, (mid + 1), high, key);
		return binarySearchRecursion(arr, low, (mid - 1), key);
	}
}





