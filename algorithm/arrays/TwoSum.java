package com.informatica.alog.sdet;

import java.util.HashMap;


/*
 * Given an array A[] and a number x, check for pair in A[] with sum as x
 */

public class TwoSum {

	/*
	 * This method this the best and have O(n) time complexity.
	 * Solution is simple though Map. In Map keep the difference between target and current number and if it is not found in map store in map with 
	 * index. At some point of time difference will be found in map and you just need to return the index.
	 */
	
	public static int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];
		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(numbers[i])) {
				int index = map.get(numbers[i]);
				result[0] = index;
				result[1] = i;
				break;
			} else {
				map.put(target - numbers[i], i);
			}
		}
		return result;
	}
	
	
	// This is not the best solution but good to start with. This expect array to be sorted. If array is not sorted then you have to sort the array first and then apply this logic.
	public static int[] twoSumSortedArray(int[] numbers, int target) {

		int i = 0;
		int j = numbers.length - 1;
		while (i < j) {
			int sum = numbers[i] + numbers[j];
			if (sum < target) {
				++i;
			} else if (sum > target) {
				j--;
			} else {
				return new int[] { i + 1, j + 1 };
			}
		}
		return null;
	}
	
	/*
	 * There is third solution for this problem using list which can be find here
	 * http://javabypatel.blogspot.in/2017/05/find-pairs-whose-sum-equals-number-k.html
	 */
	

	public static void main(String[] args) {
		int[] number = { 1, 4, 45, 6, 10, 8 };
		//int [] sorted = { 1, 4, 6, 8, 10,45 };
		int target = 14;
		int[] result = twoSum(number, target);
		//int [] result = twoSumSortedArray(number, target);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
