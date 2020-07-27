package com.informatica.alog.sdet;

import java.util.HashSet;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String str = "manojkumarrajan";
		char[] chars = str.toCharArray();
		HashSet<Character> hset = new HashSet<Character>();
		for (int i = 0; i < chars.length; i++) {
			if (!hset.add(chars[i]))
				System.out.println(chars[i] + " is duplicate");
			else
				hset.add(chars[i]);
		}
		//hset.iterator();
	}

}
