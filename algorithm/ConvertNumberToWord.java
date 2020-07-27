package com.informatica.alog.sdet;

/*
 * Not very through you should see it again
 */

public class ConvertNumberToWord {

	public static String numberToWordHelper(int num) {
		String[] single_digits = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String[] two_digits = new String[] { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
		String[] tens_multiple = new String[] { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

		String result = "";
		if (num > 99) {
			result += single_digits[num / 100] + " Hundred ";
		}
		num = num % 100;
		if (num < 20 && num > 9) {
			result += two_digits[num % 10] + " ";
		} else {
			if (num > 19) {
				result += tens_multiple[num / 10] + " ";
			}
			num = num % 10;
			if (num > 0)
				result += single_digits[num] + " ";
		}
		return result;
	}

	public static String numberToWords(int num) {
		if (num == 0)
			return "Zero";
		String result = numberToWordHelper(num % 1000);
		num = num / 1000;
		if (num > 0 && num % 1000 > 0) {
			result = numberToWordHelper(num % 1000) + "Thousand " + result;
		}
		
		/*num = num / 1000;
		if (num > 0 && num % 1000 > 0) {
			result = numberToWordHelper(num % 1000) + "Million " + result;
		}
		num = num / 1000;
		if (num > 0) {
			result = numberToWordHelper(num % 1000) + "Billion " + result;
		}*/
		
		return result.trim();
	}

	public static void main(String[] args) {
		//System.out.println(numberToWords(11234));
		System.out.println(numberToWords(4321));
	}

}
