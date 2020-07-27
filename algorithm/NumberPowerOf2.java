package com.informatica.alog.sdet;

/*
 * @author marajan
 * 
 * Given a positive integer, write a function to find if it is a power of two or not.

	Examples :

		Input : n = 4
		Output : Yes
		2 to the power 2 = 4

		Input : n = 7
		Output : No

		Input : n = 32
		Output : Yes
		2 to the power 5 = 32
 */

public class NumberPowerOf2 {
	
	static int count = 0;

	static boolean isPowerOfTwo(int num) {
		if (num == 0 || num == 1)
			return false;

		while (num > 1) {
			if (num % 2 != 0)
				return false;
			else{
				num = num / 2;
				count++;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		int num = 32;
		if (isPowerOfTwo(num)){
			System.out.println("Yes");
			System.out.println(num +" is 2 to the power of " + count);
		}
		else
			System.out.println("No");
	}

}
