package com.informatica.alog.sdet;

/*
 * @author marajan
 *
 * What is peak element : element is peak if it greater than or equal to its neighbors
 * Below solution is not to find peak element. it is to find biggest peak element.
 * If you want to see how to find a peak element in O(Logn). see the video : https://www.youtube.com/watch?v=a7D77DdhlFc
 * 
 *  
 *  O(N) Solution
 *   Trick is simple
 * 1.) Keep 3 variables for curr, prev and next
 * 2.) Have max to keep max values
 * 3.) first and last element will be handled separately at the end
 */

public class FindLargestPeakElement {

	public static void findPeakElement(int[] arr) {

		int max = 0;

		for (int i = 1; i < arr.length - 1; i++) {
			int prev = arr[i - 1];
			int curr = arr[i];
			int next = arr[i + 1];

			if (curr > prev && curr > next && curr > max) {
				max = curr;
			}
		}
		if (arr[arr.length - 1] > max) {
			max = arr[arr.length - 1];
		}
		if (arr[0] > max) {
			max = arr[0];
		}
		System.out.println("Peak element is :: " + max);

	}
	
	/*
	 * O(log n)
	 */
	
	public static Integer getPeakElement(int[] array) {

		if (array == null || array.length == 0) {
			return null;
		}

		int n = array.length;

		int start = 0;
		int end = n - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if ((mid == 0 || array[mid - 1] <= array[mid]) && (mid == n - 1 || array[mid] >= array[mid + 1])) {
				return array[mid]; // array[mid] is peak element
			} else if (mid > 0 && array[mid - 1] > array[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return null;
	}

	public static void main(String[] args) {

		int[] arr = {10, 20, 15, 2, 23, 90, 67} ; //{ 10, 1, 2, 1, 2, 3, 1, 2 };
		findPeakElement(arr);

	}

}
