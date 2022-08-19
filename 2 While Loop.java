package com.internshala.javaapp;


public class Main {

	public static void main(String[] args) {

		// WHILE Loop Syntax and Basic Example
		// WAP to print natural numbers till 10         0, 1, 2, 3,....10

		int count = 0;
		while (count <= 10) {
			System.out.println(count);
			count++;
		}

		/* WAP to find factorial of a number.
		    Example: Factorial of 5 = 5 * 4 * 3 * 2 * 1 = 120    */

		int num = 5;
		long factorial = 1;

		while (num > 0) {
			factorial *= num;   // factorial = factorial * num;
			num--;
		}
		System.out.println("Factorial is: " + factorial);
	}
}
