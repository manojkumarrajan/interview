package com.informatica.alog.sdet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


/*
 * @author marajan
 */

// Other solution could be like MostFrequentChar.java also

public class FirstNonRepeatingCharacter {
	
	public static Map<Character, Integer> setCount(String str) {
		Map<Character, Integer> linkedhm = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (linkedhm.containsKey(ch)) {
				int value = linkedhm.get(ch);
				value = value + 1;
				linkedhm.put(ch, value);

			} else {
				linkedhm.put(ch, 1);
			}
		}
		return linkedhm;
	}

	
	/* This approach you have to travers string twice */
	
	public static void solution1(Map<Character, Integer> hm) {
		
		/*for(Entry<Character,Integer> entry : hm.entrySet()){
			entry.getValue()
		}*/
		
		Set<Entry<Character,Integer>> set = hm.entrySet();
		Iterator<Entry<Character, Integer>> itr = set.iterator();
		while(itr.hasNext()){
			Entry<Character, Integer> entry =  itr.next();
			if(entry.getValue() == 1){
				System.out.println("First Non-Repeating character in String is " + entry.getKey() );
			}
		}
	}
	
	/*
	 * This solution is without LinkeHashMap. Using count array. But even this solution does two round of looping of the character array. 
	 */
	public static void  solution2(String str) {
		int [] count = new int [256];
		char [] chararr = str.toCharArray();
		for(int i = 0; i < chararr.length; i++)
			count[chararr[i]]++;
		for(int i = 0; i < chararr.length; i++){
			if(count[chararr[i]] == 1)
				System.out.println("First Non-Repeating Character in the string is " + chararr[i]);
		}
		
	}
	
	/*
	 * Solution 3
	 * Instead of traversing through the character array you can just travel through count array
	 * For that you need to store the count and the index  index of the first time you encountered the 
	 * character e.g. (3, 26) for ‘a’ meaning that ‘a’ got counted 3 times and the first time it was seen is at position 26. 
	 * For such implementation you need to create count class.
	 * 
	 	class CountIndex 
			{ 
    	int count,index; 
       	// constructor for first occurrence 
    	public CountIndex(int index) { 
        	this.count = 1; 
        	this.index = index; 
    	} 
    	// method for updating count 
    	public void incCount() { 
        	this.count++; 
    	} 
	} 
	 */

	public static void main(String[] args) {
		String str = "abcmabcdmabc";
		Map<Character, Integer> linkedhm = setCount(str);
		solution1(linkedhm);
		solution2(str);

	}


}
