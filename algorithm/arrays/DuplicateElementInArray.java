/**
 * 
 */
package com.informatica.alog.sdet;

/**
 * @author marajan
 * Jul 27, 2020
 * 
 * https://www.geeksforgeeks.org/find-the-two-repeating-elements-in-a-given-array/?ref=lbp
 */
public class DuplicateElementInArray {
	
	/*
	 * Method 1 : With extra space
	 */
	void printRepeating(int arr[], int size)  
	    { 
	        boolean count[] = new boolean [size]; 
	        int i; 
	  
	        System.out.println("Duplicate elements are : "); 
	        for (i = 0; i < size; i++)  
	        { 
	            if (count[arr[i]] == true) 
	                System.out.print(arr[i] + " "); 
	            else
	                count[arr[i]] = true; 
	        } 
	    } 
	
	
	/*
	 * https://www.geeksforgeeks.org/find-duplicates-in-on-time-and-constant-extra-space/?ref=lbp
	 * Method 2 is could be asked as seprate algorithm. 
	 * Method 2 : Without extra space
	 * When i = 0
	 * arr[i] = 4
	 * Math.abs(arr[i]) = 4
	 * arr[Math.abs(arr[i])]
	 * Why Math.abs() is needed?
	 * We are setting up negative values and while accessing the value negative value arrayIndexOutofBound will come as there can't be index in negative values.
	 * arr[arr[i]] = Negative value is an issue here
	 */
	
	void printRepeatingNoExtraSpace(int arr[], int size)  
    { 
        int i; 
  
        System.out.println("Duplicate elements are : "); 
        for (i = 0; i < size; i++)  
        { 
            if (arr[Math.abs(arr[i])] > 0) 
            	arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];    
            else
              System.out.print(Math.abs(arr[i]) + " ");
        } 
    }
	  
	    public static void main(String[] args) 
	    { 
	    	DuplicateElementInArray repeat = new DuplicateElementInArray(); 
	        int arr[] = {4, 2, 4, 5, 2, 3, 1}; 
	        int arr_size = arr.length; 
	       // repeat.printRepeating(arr, arr_size); 
	        repeat.printRepeatingNoExtraSpace(arr, arr_size);
	    } 

}
