package com.informatica.alog.sdet;

/*
 * @author marajan
 * 
 * Pictorial representation : https://www.geeksforgeeks.org/merge-two-sorted-arrays/
 * Merge two sorted array using array3
 * Traverse though array1 and array2
 * if(arr1[element]<arr2[element])
 * 	than arr3[element] =  arr1[element]
 * 			increment element of arr1
 * 			increment element of arr3
 * else
 * 		arr3[element] = arr2[element]
 * 		increment element of arr2
 * 		increment element of arr3
 * Next loop
 * 	if( arr1 element < arr1.length) that means these element are left out and should be added to arr3
 * 	if( arr2 element < arr2.length) that means these element are left out and should be added to arr3
 */

public class MergeSortedArrayInThirdArray {
	
	public static void main(String [] args){
		 int arr1[] = {1, 5, 9, 10, 15, 20};
	     int arr2[] = {2, 3, 8, 13};
	    mergeSortedArray(arr1,arr2);
	}
	
	
	public static void mergeSortedArray(int[] arr1, int[] arr2) {
		int arr3[] = new int[arr1.length - 1 + arr1.length - 1];

		int arr1Len = arr1.length;
		int arr2Len = arr2.length;
		int k = 0;
		int i = 0;
		int j = 0;
		while (i < arr1Len && j < arr2Len) {
			if (arr1[i] < arr2[j]) {
				arr3[k] = arr1[i];
				i++;
				k++;
			} else {
				arr3[k] = arr2[j];
				j++;
				k++;
			}
		}

		while (i < arr1Len) {
			arr3[k] = arr1[i];
			i++;
			k++;
		}

		while (j < arr2Len) {
			arr3[k] = arr1[j];
			j++;
			k++;
		}
		i = 0;

		while (i < arr3.length) {
			System.out.print(arr3[i] + " ");
			i++;
		}

	}

}
