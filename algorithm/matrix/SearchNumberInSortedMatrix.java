package com.informatica.alog.sdet;

//

/*	@author marajan
 * 
 * http://www.geeksforgeeks.org/search-in-row-wise-and-column-wise-sorted-matrix/
 	There are two version of this problem
 		1.)Write an efficient algorithm that searches for a value in an m x n matrix. This matrix where properties:
			a) Integers in each row are sorted from left to right. 
			b) The first integer of each row is greater than the last integer of the previous row.
			
			[
				[1, 3, 5, 7],
				[10, 11, 16, 20],
				[23, 30, 34, 50]
			]
			
		You may try to solve this problem by finding the row first and then the column. There is no need to do that. 
		Because of the matrix’s special features, the matrix can be considered as a sorted array. Your goal is to find 
		one element in this sorted array by using binary search.
		
		It is not that you can't search target in a sorted array using 2nd method. But if you use array 
		arribute "sorted" and use first method it is much faster.
		
		2.) Write an efficient algorithm that searches for a value in an m x n matrix. This matrix where properties "
			    a.)	Integers in each row are sorted from left to right. 
			    b.) Integers in each column are sorted in ascending from top to bottom.
			    
			 [
				[1, 4, 7, 11, 15],
				[2, 5, 8, 12, 19],
				[3, 6, 9, 16, 22],
				[10, 13, 14, 17, 24],
				[18, 21, 23, 26, 30]
			 ]  
			 
			 
			If Current Element =  Search element, Return True, element found.
			If Current Element <  Search element, It means all element on left of current element are smaller and 
									no need to look on left. Check element on next column.
			If Current Element >  Search element, It means all element on below current element are higher and 
									no need to look down. Check element in left side on same row.
			    
 */

/*
 * Given an n x n matrix and a number x, find position of x in the matrix if it is present in it. 
 * Else print “Not Found”. In the given matrix, every row and column is sorted in increasing order. 
 */

/*
 *					{ 10, 20, 30, 40 }, 
					{ 15, 25, 35, 45 }, 
					{ 27, 29, 37, 48 }, 
					{ 32, 33, 39, 50 } 
					
 */

public class SearchNumberInSortedMatrix {

	public static void searchInRowAndColWiseSortedMatrix(int mat[][], int n, int k) {
		int row = 0;
		int col = n - 1;
		while (row < n) {
			System.out.println(mat[row][col]);
			if (mat[row][col] == k) {
				System.out.println("Index of " + k + " is :: " + row + "," + col);
				break;
			}
			if (mat[row][col] < k) {
				row++;
			}
			if (mat[row][col] > k) {
				col--;
			}
		}
	}
	
	
	
	public static boolean returnIndexSortedArray(int mat[][], int target) {
		if (mat == null || mat.length == 0 || mat[0].length == 0)
			return false;
		int m = mat.length;
		int n = mat[0].length;
		int start = 0;
		int end = m * n - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			int midRow = mid / n;
			int midCol = mid % n;
			if (mat[midRow][midCol] == target)
				return true;
			if (mat[midRow][midCol] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int mat[][] = { 
					{ 10, 20, 30, 40 }, 
					{ 15, 25, 35, 45 }, 
					{ 27, 29, 37, 48 }, 
					{ 32, 33, 39, 50 } 
					};

		int mat1[][] =  {
		 				{1, 3, 5, 7},
						{10, 11, 16, 20},
						{23, 30, 34, 50},
						{51, 53, 54, 55}
						} ;
		
		searchInRowAndColWiseSortedMatrix(mat, mat[0].length, 50);
			//returnIndex(mat1, mat1[0].length, 51);
		//returnIndexSortedArray(mat1, 51);

	}

}
