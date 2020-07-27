/**
 * 
 */
package com.informatica.alog.sdet;

/**
 * @author marajan
 * Jul 27, 2020
 * 
 * Given 3 sorted array find common elements in these 3 sorted array.
 *
 * Time complexity is O(m + n + k)
 *
 * http://www.geeksforgeeks.org/find-common-elements-three-sorted-arrays/
 */
 

public class CommonThreeSortedArray {
	
	 void findCommon(int ar1[], int ar2[], int ar3[]) 
	    { 
	       int i = 0, j = 0, k = 0; 
	       while (i < ar1.length && j < ar2.length && k < ar3.length) 
	        { 
	             // If x = y and y = z, print any of them and move ahead 
	             // in all arrays 
	             if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) 
	             {   System.out.print(ar1[i]+" ");   i++; j++; k++; } 
	  
	             // x < y 
	             else if (ar1[i] < ar2[j]) 
	                 i++; 
	             // y < z 
	             else if (ar2[j] < ar3[k]) 
	                 j++; 
	  
	             // We reach here when x > y and z < y, i.e., z is smallest 
	             else
	                 k++; 
	        } 
	    } 

	public static void main(String args[]) 
    { 
		CommonThreeSortedArray ob = new CommonThreeSortedArray(); 
  
        int ar1[] = {1, 5, 10, 20, 40, 80}; 
        int ar2[] = {6, 7, 20, 80, 100}; 
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}; 
  
        System.out.print("Common elements are "); 
        ob.findCommon(ar1, ar2, ar3); 
    }
}
