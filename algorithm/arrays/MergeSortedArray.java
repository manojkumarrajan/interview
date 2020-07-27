package com.informatica.alog.sdet;

/*
 * @author marajan
 * 
 * Merge two sorted arrays
 * One sorted array has extra space at the end. Extra space is filled with 0.
 * Finally array which has extra space should be sorted array after merge.
 * You know in advance which is the bigger array.
 */

public class MergeSortedArray {
	
	public static void main(String [] args){
		 int arr1[] = {1, 5, 9, 10, 15, 20, 0, 0, 0, 0};
	     int arr2[] = {2, 3, 8, 13};
	     mergeSortedArray(arr1,arr2);
	     for(int i = 0; i< arr1.length ; i++){
	    	 System.out.print(arr1[i] + " ");
	     }
	}
	
	
	public static void mergeSortedArray(int[] arr1, int[] arr2) {

		int j = arr2.length - 1;
		int k = arr1.length - 1;

		int lastIndex = 0;
		while (lastIndex < arr1.length) {
			if (arr1[lastIndex] == 0) {
				break;
			} else
				lastIndex++;
		}

		int i = lastIndex - 1;
		while (k > 0) {
			if (arr1[i] > arr2[j]) {
				arr1[k] = arr1[i];
				k--;
				i--;
			} else {
				arr1[k] = arr2[j];
				k--;
				j--;
			}
		}
		System.out.println();
	}
}
