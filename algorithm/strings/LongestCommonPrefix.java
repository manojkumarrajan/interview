
package com.informatica.alog.sdet;

/*
 * @author marajan
 * 
 * There are two tricks that you have to apply
 * 1.) Convert String array to 2D char array
 * 2.) While converting string array to 2D char array find the length of shortest string or you can get the sortested string or it's length
 * 3.) Then apply 2 loop and keep traverse to compare the characters in 2D array
 */

public class LongestCommonPrefix {

	public static int shortestStringLen = 0;

	public static void main(String[] args) {
		String[] strArr = { "WORLDD", "WORLDSssssssssssssssss", "WORLD" };
		char[][] char2D = convertStringArrayTo2DCharArray(strArr);
		System.out.println(getShortestString(strArr));
		System.out.println(findLongestCommonPrefix(char2D, getShortestString(strArr)));
	}

	public static String findLongestCommonPrefix(char[][] char2D, String shortestString) {
		String shortestCommonPrefix = "";

		for (int i = 0; i < shortestString.length(); i++) {
			char element = shortestString.charAt(i);
			for (int j = 0; j < char2D.length; j++) {
				if (element != char2D[j][i]) { // notice here - it is not [i][j]. it is [j][i]
					return shortestCommonPrefix;
				}
			}
			shortestCommonPrefix = shortestCommonPrefix + element;
		}
		return shortestCommonPrefix;
	}
	
	public static char[][] convertStringArrayTo2DCharArray(String[] strArr) {

		char[][] char2D = new char[strArr.length][];
		for (int i = 0; i < strArr.length; i++) {
			char2D[i] = strArr[i].toCharArray();
		}
		return char2D;
	}
	
	public static String getShortestString(String[] strArr) {
		String shortestString = "";
		int length = strArr[0].length();
		for (int i = 1; i < strArr.length; i++) {
			if (length > strArr[i].length())
				shortestString = strArr[i];
		}
		return shortestString;
	}
		
	

	/*public static char[][] convertStringArrayTo2DCharArray(String[] strArr) {

		char[][] char2D = new char[strArr.length][];
		for (int i = 0; i < strArr.length; i++) {
			char2D[i] = strArr[i].toCharArray();
			if (shortestStringLen == 0) {
				shortestStringLen = char2D[i].length;
			} else if (char2D[i].length < shortestStringLen) {
				shortestStringLen = char2D[i].length;
			}
		}
		return char2D;
	}*/

}
