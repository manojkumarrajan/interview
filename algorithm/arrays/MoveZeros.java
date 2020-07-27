package com.informatica.alog.sdet;

//Move Zeroes
	/*
	 * @author marajan
	 * 
	 	Given an array of nums, write a function to move all 0’s to the end of it while maintaining
		the relative order of the non-zero elements.
		For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should
		be [1, 3, 12, 0, 0].
 */

public class MoveZeros {

	public static int[] moveZeroes(int[] nums) {
		int i = 0;
		int j = 0;
		while (j < nums.length) {
			if (nums[j] == 0) {
				j++;
			} else {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i++;
				j++;
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 2, 0, 5, 6, 7, 0 };
		moveZeroes(nums);
		int i = 0;
		while (i < nums.length) {
			System.out.print(nums[i] + " ");
			i++;
		}
	}

}
