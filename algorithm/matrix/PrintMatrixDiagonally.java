package com.informatica.alog.sdet;

/*
 * @author marajan
 * 
 You can find pictorial representation and more detailed description of solution in below link
 http://javabypatel.blogspot.in/2016/12/print-matrix-diagonally-or-diagonal.html
 
Input:
  {1,  2,  3,  4},
  {5,  6,  7,  8},
  {9,  10, 11, 12},
  {13, 14, 15, 16},
  {17, 18, 19, 20},
   
Output:
  1
  5   2
  9   6   3
  13  10  7  4 
  17  14  11 8
  18  15  12
  19  16
  20  
*/

public class PrintMatrixDiagonally {

	public static void main(String[] args) {
		new PrintMatrixDiagonally();
	}

	public PrintMatrixDiagonally() {
		int[][] matrix = { 
				{ 1,  2,  3,  4 }, 
				{ 5,  6,  7,  8 }, 
				{ 9,  10, 11, 12 }, 
				{ 13, 14, 15, 16 }, 
				{ 17, 18, 19, 20 } 
				};

		printMatrixDiagonally(matrix);;
	}

	private void printMatrixDiagonally(int[][] matrix) {

		int rowCount = matrix.length;
		int columnCount = matrix[0].length;
		
		for (int r = 0; r < rowCount; r++) {
			for (int row = r, col = 0; row >= 0 && col < columnCount; row--, col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}

		for (int c = 1; c < columnCount; c++) {
			for (int col = c, row = rowCount - 1; row >= 0 && col < columnCount; row--, col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}

	}

}
