package com.informatica.alog.sdet;

import java.util.Arrays;

/*
 * @author marajan
 * 
 * Not very clear. Need to cover again if time permits. June 2019
 * Given a string, find the length of the longest substring without repeating characters
 */

public class LengthOfLongestSubstring {
	
	public static void main(String [] args){
		String str = "abcadafgij";
		System.out.println(lengthOfLongestSubstring(str));
	}
	
	
	
	public static int lengthOfLongestSubstring(String s) {
		int[] count = new int[256];
		Arrays.fill(count, -1);
		int i = 0, maxLen = 0;
		for (int j = 0; j < s.length(); j++) {
			char ch = s.charAt(j);
			if (count[ch] >= i) {
				i = count[ch] + 1;
			}
			count[ch] = j;
			maxLen = Math.max(j - i + 1, maxLen);
		}
		return maxLen;
	}

}
