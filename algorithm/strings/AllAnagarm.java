package com.informatica.alog.sdet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 
 * @author marajan
 * Jul 27, 2020
 * 
 * Problem statement 
 * Given a sequence of words, print all anagrams together
 * https://www.geeksforgeeks.org/given-a-sequence-of-words-print-all-anagrams-together/
 * 
 * Solution :
 * Let us understand the steps with following input Sequence of Words:

	"cat", "dog", "tac", "god", "act"
	Step 1 : Create one hashmap which can contain String a key and list as value. 
			 HashMap<String, List<String>>
	Step 2 : Iterator through the words list
	Step 3 : Keep copy of word as actual word
	 		 Create char array from the word
	 		 Sort the char array
	 		 Create a new word which is has sorted characters
	 Step 4 : Sorted new word is your key. So if you have anagram than multiple word will sort to one word and that will be the key.
	 		  Actual word will be added as value. For example
	 		  dog and god. For both sorted word is - dgo. dgo becomes the key for both the word and dgo key will have two values[dog,god]
	 Step 5 : If map does not contain sorted word as key than create one entry in map with sorted word as key and values as actual word.
		  	  If map contains sorted word as key than just get the list and add new value in the list.
	 Step 6: Once Step 2 iteration is over. Print all the list which have more than 1 values. List containing more than one value is actually anagrams.	  	
	 
	 In above approach every word has to be sorted to maintain the similar key. That will cost extra time. You can have another solution where you will 
	  create hashmap to maintain the frequency of the characters which will generate the same hash function for different string having same frequency of characters.  
		  	  
 */

public class AllAnagarm {

	public static void main(String[] args) {
		String words[] = { "cat", "dog", "tac", "god", "act" };
		printAllAngram(words);
	}

	public static void printAllAngram(String[] words) {
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		for (int i = 0; i < words.length; i++) {
			String actualword = words[i];
			char[] temp = words[i].toCharArray();
			Arrays.sort(temp);
			String sortedword = new String(temp);
			if (map.containsKey(sortedword))
				map.get(sortedword).add(actualword);
			else {
				ArrayList<String> list = new ArrayList<String>();
				list.add(words[i]);
				map.put(sortedword, list);
			}
		}
		for(String s : map.keySet()){
			List<String> values = map.get(s);
			if(values.size()>1)
				System.out.print(values);
		}
	}
}
