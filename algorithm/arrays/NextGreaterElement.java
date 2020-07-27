package com.informatica.alog.sdet;

import java.util.Stack;

/*
 * @author marajan
 * 
 * Problem:
 * 
 * Given an array, print the Next Greater Element (NGE) for every element. The Next greater Element for an element x 
 * is the first greater element on the right side of x in array. Elements for which no greater element exist, consider next greater element as -1.
 * 
 * https://www.geeksforgeeks.org/next-greater-element/
 * 
 * Create one stack
 * Push first element of the array in stack
 * Remaining array's first element we will call it next 
 * Pop the element from stack. let's call it element
 * Compare element < next or element > next
 * If element < next than print it as you find the next greater element. 
 * In loop Keep poping from stack and keep check if element is < next and keep print until stack is empty or element < next is false.
 * If element > next than you need to push back the next to stack 
 * Push the  element to stack
 * Move next to new element.
 * 
 */

public class NextGreaterElement {

	static void printNGE(int arr[]) {
		int i = 0;
		Stack<Integer> stack = new Stack<Integer>();
		int stackElement, arrElement;
		stack.push(arr[0]);
		for (i = 1; i < arr.length; i++) {
			arrElement = arr[i];
			if (stack.isEmpty() == false) {
				stackElement = stack.pop();

				/*
				 * If the popped element is smaller than next, then 
				 * a) print the pair 
				 * b) keep popping while elements are smaller and stack is not empty
				 */
				while (stackElement < arrElement) {
					System.out.println(stackElement + " --> " + arrElement);
					if (stack.isEmpty() == true)
						break;
					stackElement = stack.pop();
				}
				if (stackElement > arrElement)
					stack.push(stackElement);
			}

			/*
			 * push next to stack so that we can find next greater for it
			 */
			stack.push(arrElement);
		}

		/*
		 * After iterating over the loop, the remaining elements in stack do not have the next greater element, so print -1 for them
		 */
		while (stack.isEmpty() == false) {
			stackElement = stack.pop();
			arrElement = -1;
			System.out.println(stackElement + " -- " + arrElement);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 51, 13, 52, 31, 2 };
		printNGE(arr);
	}
}
