package com.calculator;

public class BooleanExamples {

	public static void main (String args[]) {
		///////////////////////
		boolean day = true;
		Boolean night = false;
		Boolean isNull = null;
		int a = 1,b = 1;

		// AND     OR    Negation   XOR (exclusive OR)
		// &&      ||    !          ^

		// замыкание
		// precedence : (! && ||)
		// слева направо >>>>
		// equals
		// > < == >= !=
		System.out.println("Entering");
		if (printSomething1(a != 0)) {
			printSomething2(b == 1);
			System.out.println("1111111");
			System.out.println("2222222");
			System.out.println("3333333");
		} else {
			System.out.println("Nothing matches");
		}
		System.out.println("Exiting...");
	}
	// логическое умножение
	//


	public static boolean printSomething1(boolean b) {
		System.out.println("++++++++");
		return b;
	}

	public static boolean printSomething2(boolean b) {
		System.out.println("*******");
		return b;
	}

	public static boolean printSomething3(boolean b) {
		System.out.println("=========");
		return b;
	}
}
