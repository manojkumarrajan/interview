package com.informatica.alog.sdet;


import java.util.HashMap;
import java.util.Stack;

/*
 * @author marajan
 */

public class BalancedParanthesis {
	public static void main(String[] args) {
		BalancedParanthesis bp = new BalancedParanthesis();
		//String exp = "((({[)}{})))()";
		String exp = "((({[]}{})))()";
		System.out.println("Is expression balanced = " + bp.solution1(exp));
		
		System.out.println("Is expression balanced = " + bp.solution2(exp));
	}

	/*
	 * Approach 1 is just using stack. No extra data structure.
	 * Simple and while interview you should give this solution.
	 * Tested with all possible test and it pass
	 * Got some change from Ayas's code to fix the old issue.
	 */

	public boolean solution1(String exp) {
		Stack<Character> stack = new Stack<Character>();
		char[] arr = exp.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '{' || arr[i] == '(' || arr[i] == '[') {
				stack.push(arr[i]);
			} else if (arr[i] == '}' || arr[i] == ')' || arr[i] == ']' && !stack.isEmpty()) {
				char lastchar = stack.pop();
				System.out.println(arr[i]);
				if ((arr[i] == ')' && lastchar != '(') || (arr[i] == ']' && lastchar != '[') || (arr[i] == '}' && lastchar != '{'))
					return false;
					
					
			}
		}
		return stack.isEmpty();
	}
	
	
	/*
	 * All test pass in the approach
	 * Create a Hashmap
	 * Create stack (FIFO)
	 * Fill Hashmap with key = (,{,{ and value=),},]
	 * Traverse char array and check if char is a key, If it is key than push
	 * If char is not key than pop the char and compare if it is equal to current character
	 * if not equal return false.
	 * if traverse end and stack is empty that means tree is balanced
	 */
	public boolean solution2(String exp) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		Stack<Character> stack = new Stack<Character>();

		char[] chararr = exp.toCharArray();
		for (int i = 0; i < chararr.length; i++) {
			if (map.keySet().contains(chararr[i])) {
				stack.push(chararr[i]);
			} else if (map.values().contains(chararr[i]) && !stack.empty()) {
				if (map.get(stack.pop()) != chararr[i])
					return false;
			}
		}

		return stack.empty();
	}

}
