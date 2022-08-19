package com.internshala.javaapp;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// DO WHILE Loop Syntax and Basic Example
		// WAP to print natural numbers till 10         0, 1, 2, 3,....10

		int count = 0;  // OPTIONAL: While and Do While
		do {
			System.out.println(count);
			count++;
		} while (count <= 10);


		// WAP to add numbers until user enters ZERO
		Scanner scanner = new Scanner(System.in);

		double number = 0;
		double sum = 0;
		do {
			System.out.println("Enter a number: ");
			number = scanner.nextDouble();
			sum += number;
		} while (number != 0);
		System.out.println("The sum is: " + sum);
	}
}
