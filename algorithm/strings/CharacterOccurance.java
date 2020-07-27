package com.informatica.alog.sdet;

import java.util.HashMap;
import java.util.Map;

/*
 * @author marajan
 */


public class CharacterOccurance {

	public static void main(String[] args) {
		String str = "manojkumarrajan";
		char[] chars = str.toCharArray();
		getCharOccurance(chars);
	}

	public static void getCharOccurance(char chars[]) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < chars.length; i++) {
			if (!map.containsKey(chars[i]))
				map.put(chars[i], 1);
			else {
				map.put(chars[i], map.get(chars[i]) + 1);
			}
		}
	}

	public static void printMap(Map<Character, Integer> map) {
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println("Character :: " + entry.getKey() + " Total Occurance :: " + entry.getValue());
		}
	}

}
