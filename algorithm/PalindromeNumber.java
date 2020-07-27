package com.informatica.alog.sdet;


/**
 * @author marajan
 * 
 * Problem statement : Find out if given number is plindrome
 * Another question approach would be same : Reverse a number
 * 
 * You can do it using brute force and recursive both
 *
 */


public class PalindromeNumber {

	public static void main(String[] args) {
		//for(int i = 10000 ;i <12000 ;i++)
		{
		isPlandrom(12321);
		//System.out.println();
		//isPlandromRecursion(i);
		}
	}

	static void isPlandrom(int num) {
		int copy = num;
		int sum = 0;
		while (num != 0) 
		{
			int reminder;
			reminder = num % 10;
			num = num / 10;
			sum = sum * 10 + reminder;
		}
		if(copy == sum)
		System.out.println("Number ::  " + copy + " is plindrom");
	}
	
	
	
	static boolean isPlandromRecursion(int n, int dupNum) {
		
		if (oneDigit(n))
	        return (n == (dupNum) % 10);
		
		 if (!isPlandromRecursion(n/10, dupNum))
		        return false;
		    dupNum /= 10;
		    return (n % 10 == (dupNum) % 10);
		
		}
	
	static boolean oneDigit(int num)
	{
	    // comparison operation is faster than division operation.
	    // So using following instead of "return num / 10 == 0;"
	    return (num >= 0 && num < 10);
	}
			
		

}
