package com.informatica.alog.sdet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/*
 * 
 * @author marajan
 * Jul 27, 2020
 * 
 * Check whether two strings are anagram of each other
 * listen   - silent
 * triangle - integral 
 */

public class Anagram {

	public static void main(String[] args) {
		Anagram an = new Anagram();
		// an.soluation1(String str, String str1);
		String str = "listen";
		String str1 = "silent";

		System.out.println(an.solution3(str, str1));

	}

	public void soluation1(String str, String str1) {
		if (str.length() == str1.length()) {

			if (this.sort(str).equals(this.sort(str1))) {
				System.out.println("String are Anagram");
			} else
				System.out.println("String are not Anagram");
		} else
			System.out.println("String are not Anagram because length is not same");
	}

	public String sort(String str) {
		char[] charArr = str.toCharArray();
		Arrays.sort(charArr);
		String sorted = new String(charArr);
		return sorted;
	}

	/*
	 * Convert both the string to character array
	 * Store first char array in hashmap. Key = Char and Value = Occurance
	 * If one character appears more than one value will increase by +1
	 * Travel through second char array and check two condition
	 *  a.) Hashmap contains this character
	 *  b.) And value of that character in hashmap is > 0
	 * Inside the loop once character is found go and reduce the value by 1 in the hash map. 
	 * This way b.) condition will be used 
	 * 
	 */
	
	
	public void solution2(String str1, String str2) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] chararr1 = str1.toCharArray();
		char[] chararr2 = str2.toCharArray();
		boolean flag = true;
		
		if (chararr1.length == chararr2.length) {
			for (int i = 0; i < chararr1.length; i++) {
				if (map.containsKey(chararr1[i])) {
					int value = map.get(chararr1[i]);
					value++;
					map.put(chararr1[i], value);
				}else
				map.put(chararr1[i], 1);
			}
			for (int i = 0; i < chararr2.length; i++) {
				if (map.containsKey(chararr2[i]) && map.get(chararr2[i]) > 0) {
					map.put(chararr2[i], map.get(chararr2[i])-1 );
					} else {
						System.out.println("Not a Anagram");
						flag = false;
						break;
					}
				}
			}
		if(flag == true)
		System.out.println("String is Anagram");
		}
		
	
	/*
	 * Solution 3 : Using two count array
	 * Convert two string in two character array
	 * Create two count integer array and fill with zero
	 * Run through character array 1 and fill the count1 and fill the occurance do the same for character array2
	 * Now compare count1 and count2 if there is any difference than it is not anagram if no difference then an analog
	 */
	public boolean solution3(String str1, String str2){
		char[] chararr1 = str1.toCharArray();
		int [] count1 = new int[256];
		//Arrays.fill(count1, 0);
		char[] chararr2 = str2.toCharArray();
		int [] count2 = new int[256];
		//Arrays.fill(count2, 0);
		
		for (int i = 0; i < chararr1.length && i < chararr2.length; i++) {
			count1[chararr1[i]]++;
			count2[chararr2[i]]++;
		}
		
		if(chararr1.length != chararr2.length)
			return false;
		
		for (int i = 0; i < 256; i++){ 
            if (count1[i] != count2[i]) 
                return false; 
		}
		return true;
	}
	
	
	/*
	 * Solution 4: Using one count array
	 * Convert two string in two character array
	 * Create One count integer array and fill with zero
	 * Run through character array 1 and fill the count1 with occurance 
	 * Run through character array 2 and reduce the occurrence by -1
	 * After that count1 array should be left only with 0 if other than 0 than it is not an anagram
	 */
	
	public boolean solution4(String str1, String str2) {
		char[] chararr1 = str1.toCharArray();
		char[] chararr2 = str2.toCharArray();
		int[] count1 = new int[256];
		//Arrays.fill(count1, 0);

		for (int i = 0; i < chararr1.length && i < chararr2.length; i++) {
			count1[chararr1[i]]++;
			count1[chararr2[i]]--;
		}

		if (chararr1.length != chararr2.length)
			return false;

		for (int i = 0; i < 256; i++) {
			if (count1[i] != 0)
				return false;
		}
		return true;
	}
	
	
}
