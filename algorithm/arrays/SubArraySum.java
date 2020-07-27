package com.informatica.alog.sdet;


/*
 * 
 *  @author marajan
 *  
 * Must try problem. No more pending
 * 
 * https://www.geeksforgeeks.org/find-subarray-with-given-sum/
 * Given an unsorted array of nonnegative integers, find a continuous subarray which adds to a given number.
 * 	Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
	Ouptut: Sum found between indexes 2 and 4

	Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
	Ouptut: Sum found between indexes 1 and 4

	Explanation of problem and solution in video
	https://www.youtube.com/watch?v=Ofl4KgFhLsM 

 */

public class SubArraySum {
	
	
	/*int subArraySum(int arr[], int sum) {
		int curr_sum = arr[0], start = 0, i;

		// Pick a starting point
		for (i = 1; i <= arr.length; i++) {
			// If curr_sum exceeds the sum, then remove the starting elements
			while (curr_sum > sum && start < i - 1) {
				curr_sum = curr_sum - arr[start];
				start++;
			}

			// If curr_sum becomes equal to sum, then return true
			if (curr_sum == sum) {
				int p = i - 1;
				System.out.println("Sum found between indexes " + start + " and " + p);
				return 1;
			}

			// Add this element to curr_sum
			if (i < arr.length)
				curr_sum = curr_sum + arr[i];

		}

		System.out.println("No subarray found");
		return 0;
	} */
	
	
	/*
	 * My own made solution. This might have some issue. But it is  working fine .
	 */
	int [] subArraySum(int arr[], int sum) {
		int left = -1, right = -1;
		int curr_sum = 0;
		int [] index = new int[2];
		for (int i = 0; i < arr.length; i++) {
			
			if(curr_sum < sum){
				right ++;
				curr_sum+=arr[right];
				
			}
			if(curr_sum > sum){
				left ++;
				curr_sum-=arr[left];
				
			}
			if(curr_sum == sum){
				index[0] = left+1;
				index[1] = right;
				break;
			}
		}
		return index;
	}
	
	
	
	
	public static void main(String[] args)  
	{
		SubArraySum arraysum = new SubArraySum();
		int arr[] = { 1, 4, 0, 0, 3, 10, 5 };
		int n = arr.length;
		int sum = 7;
		//System.out.println(arraysum.subArraySum(arr, sum));
		int index [] = arraysum.subArraySum(arr, sum);
		for (int i = 0; i < index.length; i++) {
			System.out.println(index[i]);
		}
	} 

}
