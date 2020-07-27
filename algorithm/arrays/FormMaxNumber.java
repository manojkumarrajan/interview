package com.informatica.alog.sdet;

/*
 * @author marajan
 * 
 * http://www.geeksforgeeks.org/find-maximum-number-can-formed-digits-number-reviewed/
 * 
 * Given a number, write a program to find a maximum number that can be formed using all of the digits of this number.
 * Time Complexity: O( N log N ), where N is the number of digits in the given number.
 * 
 * count[str.charAt(i) - '0']++;
 * Above statement means. Let's say charAt(i)=8 that means '8' - '0' = which means ascii of '8' (56) minus ascii of zero (48). So 51-48= 8 
 * Or instead of making it string just get one by one digit from number and mark the count array. Both solution present below
 * 
 * There are two thing to be remembered to solve this
 * 1.) Have a count Array and keep marking and increasing the count of number to it correspondence index
 * 2.) Create a multiplier which will regenerate the new number.
 * 
 * 
 */

public class FormMaxNumber {

	static int solution1(int num) {
		// count array to store count of digits. As there could be numbers btw 0-9 (10 elements) and that's why array size is set to 10.
		int count[] = new int[10];

		// Converting given number to string
		String str = Integer.toString(num);

		// Updating the count array
		/*for (int i = 0; i < str.length(); i++)
			count[str.charAt(i) - '0']++;*/
		
		/* This part can be understood in PalindromeNumber.java as well.*/
		
		while (num > 0) {
			int rem = num % 10;
			num = num / 10;
			count[rem]++;
		}
		

		// result is to store the final number
		int result = 0, multiplier = 1;

		// See solution2 which is much simpler. Traversing the count array to calculate the maximum number
		for (int i = 0; i <= 9; i++) {
			while (count[i] > 0) {
				result = result + (i * multiplier);
				count[i]--;
				multiplier = multiplier * 10;
			}
		}
		return result;
	}
	
	public static void solution2(int num) {
		int[] count = new int[10];
		while (num > 0) {
			int rem = num % 10;
			num = num / 10;
			count[rem]++;
		}

		String tmp = "";

		for (int i = count.length - 1; i >= 0; i--) {
			for (int j = count[i]; j > 0; j--) {
				tmp = tmp + i;
			}
		}
		System.out.println(Integer.parseInt(tmp));
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		int num = 38293367;
		System.out.println(solution1(num));
		solution2(num);
	}
}
