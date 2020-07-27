package com.informatica.alog.sdet;

/*
 *  @author marajan
 *  
 * 	https://www.geeksforgeeks.org/equilibrium-index-of-an-array/
 * 	Equilibrium index of an array
	Equilibrium index of an array is an index such that the sum of elements at lower 
	indexes is equal to the sum of elements at higher indexes. For example, in an arrya A:
	
	
	Trick to remember:
		Get the total sum of the arr
		Get the right some until right and left is same.
			sum = sum - arr[i]
		If leftsum is equal to sum, then return current index. 
		Get the left Sum
			leftsum = leftsum + arr[i]
			
 */

public class SumOfBothEndEqual {

	static int findElement(int arr[], int size) {
		int sum = 0; // initialize sum of whole array 
        int leftsum = 0; // initialize leftsum 
  
        /* Find sum of the whole array */
        for (int i = 0; i < arr.length; ++i) 
            sum += arr[i]; 
  
        for (int i = 0; i < arr.length; ++i) { 
            sum -= arr[i]; // sum is now right sum for index i 
  
            if (leftsum == sum) 
                return i; 
  
            leftsum += arr[i]; 
        } 
  
        /* If no equilibrium index found, then return 0 */
        return -1; 
	}

	// Driver
	public static void main(String args[]) {
		//int arr[] = { 2, 3, 4, 1, 4, 5 };
		int arr[] = { -7, 1, 5, 2, -4, 3, 0 }; 
		int size = arr.length;
		System.out.println("First equilibrium index is " +  
				findElement(arr, size)); 
	}
}
