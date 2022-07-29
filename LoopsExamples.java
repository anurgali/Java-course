//package com.calculator;

import java.util.Scanner;

public class LoopsExamples {
	public static void main (String args[]) {
		//while loops
		boolean flag = true;
		System.out.print("Enter j between 0 and 10: ");
		Scanner sc = new Scanner(System.in);
		int j=sc.nextInt();
		Integer result = null;
		result = factorial(j);
		System.out.println("result = " + result);

	}

	private static int factorial(int b) {
		int i=1;
		int result = 1;
		while (i<b){
		}
		return result;
	}
}
