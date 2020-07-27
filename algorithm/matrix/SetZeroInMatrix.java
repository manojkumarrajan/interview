package com.informatica.alog.sdet;

public class SetZeroInMatrix {
	
	/*
	 *  @author marajan
	 * 
	 * 1. Scan first row and first column and check if 0 is present
	   2. If yes firstRowZero and firstColumnZero boolean should be set to true respectively 
	   3. Start from second row second column and traverse through all row and all column to find if there are zero.
	   4. If step 3 == true than make the corresponding first row and first column as zero ([i][0] and first column[0][j] to zero). 
	   	  This is for marking. Basically that means after looking at first row or first column
	   	  you would be knowing if there was zero in row or column or not.
	   
	   5. Now as you are done with the marking in first row, Traverse first row and first column and  set entire column and entire row as zero if zero found.
	   6. User firstRowZero and firstColumnZero to mark first row and first column as 0.
	 */

	public static void setZeroes(int[][] matrix) {
		boolean firstRowZero = false;
		boolean firstColumnZero = false;
		// set first row and column zero or not
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				firstColumnZero = true;
				break;
			}
		}
		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[0][i] == 0) {
				firstRowZero = true;
				break;
			}
		}
		// mark zeros on first row and column
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		// use mark to set elements
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}
		// set first column and row
		if (firstColumnZero) {
			for (int i = 0; i < matrix.length; i++)
				matrix[i][0] = 0;
		}
		if (firstRowZero) {
			for (int i = 0; i < matrix[0].length; i++)
				matrix[0][i] = 0;
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + ",");
			}
			System.out.println();
		}
	}

	public static void main(String [] args){
		int matrix [] [] = {
							{0,1,1,0},
							{1,1,0,1},
							{1,1,1,1}
		                };
		setZeroes(matrix);
			
		}
}

