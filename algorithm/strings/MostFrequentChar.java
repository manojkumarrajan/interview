package com.informatica.alog.sdet;
import java.util.Hashtable;

/*
 * @author marajan
 * 
 * Also see : FirstNonRepeatingCharacter.java
 * 
 * Problem Statement:
 * Given a string determine which character appears the most and the number of times that character appeared.
 */

public class MostFrequentChar {

	public static void main(String[] args) {

		MostFrequentChar obj = new MostFrequentChar();
		String str = "abcbdserersgassereasssraa";
		obj.PushInHash(str);
		obj.solution2(str);
	}

	public void PushInHash(String str) {
		
		char [] arr = str.toCharArray();
		char max_char = 0;
		int max_count = 0;
		Hashtable<Character,Integer> ht = new Hashtable<Character, Integer>();
		
		for(int i = 0; i < arr.length; i++){
			if(ht.containsKey(arr[i])){
				int value = ht.get(arr[i]);
				if(value >= max_count){
					max_count = value + 1;
					max_char = arr[i];
				}
				ht.put(arr[i], value + 1 );
			}else
				ht.put(arr[i], 1);
		}
		
		System.out.println(ht);
		System.out.println(max_char + " Character Appears " + max_count + " times Which is most number of time in Given String");
		
	}
	
	/*
	 * Solution 2
	 * Without Hash Map
	 * Using Count array
	 */
	
	public void solution2(String str) {
		char[] chararr = str.toCharArray();
		int[] count = new int[256];
		int max_count = 0;
		char max_char = 0;
		for (int i = 0; i < chararr.length; i++) {
			count[chararr[i]]++;
			if (count[chararr[i]] > max_count) {
				max_count = count[chararr[i]];
				max_char = chararr[i];
			}
		}
		
		System.out.println(max_char + " Character Appears " + max_count + " times Which is most number of time in Given String");
	}
	
	
}
