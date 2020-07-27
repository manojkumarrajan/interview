package com.informatica.alog.sdet;

/*
 *  @author marajan
 *  
   https://www.geeksforgeeks.org/?p=5234
   Method 1:
   	1) Count the number of 0s. Let count be C.
	2) Once we have count, we can put C 0s at the beginning and 1s at the remaining n – C positions in array.

	Time Complexity : O(n)

 Method 2:
 Do following while left < right
	a) Keep incrementing index left while there are 0s at it
	b) Keep decrementing index right while there are 1s at it
	c) If left < right then exchange arr[left] and arr[right]
	
	Time Complexity: O(n)

    NOTE : Both has same time complexity. So you can tell any one.
 */
public class SegregateOs1s {

	public static void main(String[] args) {
		int arr[] = new int[] { 0, 1, 0, 1, 0, 1, 1 };
		int i, arr_size = arr.length;

		arr = segregate(arr, arr_size);

		System.out.print("Array after segregation is ");
		for (i = 0; i < 6; i++)
			System.out.print(arr[i] + " ");
	}

	public static int[] segregate(int[] arr, int arr_size) {

		int left = 0;
		int right = arr_size - 1;

		while (left < right) {
			while (arr[left] == 0 && left < right) {
				left++;
			}

			while (arr[right] == 1 && left < right) {
				right--;
			}
			if (left < right) {
				arr[left] = 0;
				arr[right] = 1;
				left++;
				right--;
			}
		}
		return arr;
	}

}
