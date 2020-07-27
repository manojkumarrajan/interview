package com.informatica.alog.sdet;

/*
 * @author marajan
 *
 * 	Given a sorted array and a target value, return the index if the target is found. If not,
	return the index where it would be if it were inserted in order. You may assume no
	duplicates in the array.
 */

public class SearchInsertPosition {

	public static int search(int arr[], int low, int high, int key) {
		if (high < low)
			return -1;

		int mid = (low + high) / 2;
		if (key == arr[mid])
			return mid;
		if (key > arr[mid])
			return search(arr, (mid + 1), high, key);
		return search(arr, low, (mid - 1), key);
	}

	public static int insert(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (target > arr[mid]) {
				low = mid + 1;
			} else if (target < arr[mid]) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return low;
	}
	
	
	public static int delete(int arr[], int low, int high, int key) {
		int length = arr.length;
		int pos = search(arr, low, high, key);
		int i;
		for (i = pos; i < length; i++)
			arr[i] = arr[i + 1];

		return length - 1;
	}

	
	
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6 };
		int key = 6;
		int low = 0;
		int high = arr.length;
		
		System.out.println(search(arr, low, high, key));
		System.out.println(insert(arr, 5));
		System.out.println(delete(arr, low, high, key));
	}

}
