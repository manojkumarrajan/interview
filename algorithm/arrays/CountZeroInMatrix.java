package com.informatica.alog.sdet;

/*
 * @author marajan
 * 
 * Problem Statement : Matrix is filled with zeros and 1s. Matrix is sorted by row wise and column wise. Find the number of 0s.
 * Row wise and Column wise sorted array does not means whole matrix is sorted.
 *

 	Solution :
 	If Current Element =  1, it means, no need to look down as all element down will be 1 since columns are also sorted. 
 	Move to next column (decrement column--). 
	If Current Element = 0, It means all element on left will surely be 0 and without traversing on left side directly add 
	them all together by looking at column index and move to next row (increment row++). 
	Stop our search if control reaches the bottom left element or all columns are covered. 

 
 More details : http://javabypatel.blogspot.in/2016/10/count-zeros-in-sorted-matrix.html
 */



public class CountZeroInMatrix {
	
	
	public static void main(String [] args){
		int[][] arr = {
			    {0, 0, 0, 0, 1},
			    {0, 0, 0, 1, 1},
			    {0, 1, 1, 1, 1},
			    {0, 1, 1, 1, 1},
			    {1, 1, 1, 1, 1}
			  };
		
		int column = arr[0].length-1;
		int row = 0;
		int count = 0;
		while (row < arr[0].length && column >= 0) {
			if(arr[row][column] == 1){
				column--;
			}else{
				count = count + column + 1; // +1 because column index will always be one less then the total, isn't it?
				row ++;
			}
		}
		System.out.println(count);
		//Count is number of zero in matrix
	}

}
