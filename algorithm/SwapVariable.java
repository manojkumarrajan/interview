package com.informatica.alog.sdet;

public class SwapVariable {

	public static void main(String[] args) {
		int a = 10;
		int b = -1;
		usingBitManipulationToSwapNumbers(a, b);
		usingAdditionSubtractionWay(a, b);
	}

	private static void usingAdditionSubtractionWay(int a, int b) {
		System.out.println("Before swap a=" + a + " , " + "b=" + b);
		a = a - b;
		b = a + b;
		a = b - a;
		System.out.println("After Swap a=" + a + " , " + "b=" + b);
	}

	private static void usingBitManipulationToSwapNumbers(int a, int b) {
		System.out.println("Before swap a=" + a + " , " + "b=" + b);
		a = a ^ b;
		b = a ^ b;
		a = b ^ a;
		System.out.println("After Swap a=" + a + " , " + "b=" + b);
	}

	private static void usingMultiplicationAndDivideToSwapNumbers(int a, int b) {
		System.out.println("Before swap a=" + a + " , " + "b=" + b);
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("After Swap a=" + a + " , " + "b=" + b);
	}

}
