package com.informatica.alog.sdet;

/*
 * @author marajan
 * 
 *  Given a sorted array, remove the duplicates in place such that each element appear
 *  only once and return the new length. Do not allocate extra space for another array,
 *  you must do this in place with constant memory.
 *  For example, given input array A = [1,1,2], your function should return length = 2,
 *  and A is now [1,2].
 */

import java.util.Arrays;

public class RemoveDupFromSortedArray {

	public static void removeDup(int[] arr) {
		int next = 1;
		int curr = 0;
		// {1, 2, 2, 3, 3};

		while (next < arr.length) {
			if (arr[next] == arr[curr])
				next++;
			else {
				curr++;
				arr[curr] = arr[next];
				next++;
			}
		}

		int[] newarr = Arrays.copyOf(arr, curr + 1);
		for (int i = 0; i < newarr.length; i++) {
			System.out.print(newarr[i] + " ");
		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 3 };
		removeDup(arr);
	}
}
