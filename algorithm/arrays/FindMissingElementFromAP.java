package com.informatica.alog.sdet;


/*
 * @author marajan
 * 
 * https://www.geeksforgeeks.org/find-missing-number-arithmetic-progression/
 * 
 * Problem Statement : Given an array that represents elements of arithmetic progression in order. 
 * 					   One element is missing in the progression, find the missing number.
 * 
 * 
 * Solution: 
 * 		Use binary Search.
 * 		How to find the difference : int diff = (lastElement - firstElement)/arr.length;
 *		While searching make sure of taking care of two situation.
 * 			Missing element is just after mid element.
 * 					or
 * 			Missing element is just before mid element.
 * 		And then the most important part to find which side the missing element is 
 * 		arr[mid] == arr[0] + mid * diff that means missing element is on the right side 
 * 		if not that means missing element is on the left side.
 * 
 *  O(Logn) solution using binary search
 */




public class FindMissingElementFromAP {
	
	static int findMissing(int arr[], int low, int high, int diff)
	{
	     
	    if (high <= low)
	        return 0;
	  
	    // Find index of middle element
	    int mid = (low + high)/2;
	    
	    
	    // The element just after the middle element is missing.
	    // The arr[mid+1] must exist, because we return when
	    // (low == high) and take floor of (high-low)/2
	    if (arr[mid+1] - arr[mid] != diff)
	        return (arr[mid] + diff);
	  
	    // The element just before mid is missing
	    if (mid > 0 && arr[mid] - arr[mid-1] != diff)
	        return (arr[mid-1] + diff);
	  
	    // If the elements till mid follow AP, then recur for right half. 
	    //Let's say diff = 2, Start=2 and index = 3 if i want to know what will be the value at index 3 should be 
	    //calculate like = diff*Index = 2*3=6 + start value so 6+2=8
	    if (arr[mid] == arr[0] + mid * diff)
	        return findMissing(arr, mid+1, high, diff);
	  
	 // Else recur for left half
	    return findMissing(arr, low, mid-1, diff);
	}
	  
	 
	public static void main( String [] args){
		 int arr[] = {2, 4, 6, 8, 10, 12, 16};
		 int lastElement = arr[arr.length-1];
		 int firstElement = arr[0];
		 
		 int diff = (lastElement - firstElement)/arr.length;
		 int high = arr.length-1;
		 int low = 0;
		 System.out.println(findMissing(arr, low, high, diff));
	}


}
