package com.informatica.alog.sdet;

/*
 *  @author marajan
 * 
    Problem Statement : Given an array of integers of size ‘n’. Calculate the maximum sum of ‘k’ consecutive elements in the array.
    Time Complexity : O(n)
	Auxiliary Space : O(1)
 */

public class SlidingWindow {

	public static void main(String[] args) {
		int[] arr = { 5, 6, -2, 7, 4, 1 };

		int k = 3;
		int max_sum = 0;
		int window_sum = 0;

		// compute max_sum of first window of size k
		for (int i = 0; i < k; i++) {
			window_sum += arr[i];
		}
		max_sum = window_sum;
		
		//Compute sums of remaining windows by removing first element of previous window and adding last element of current window.
		for (int i = 0, j = k; j < arr.length; i++, j++) {
			window_sum = window_sum - arr[i] + arr[j];
			max_sum = Math.max(window_sum, max_sum);
		}
		System.out.println(max_sum);

	}

}
