package com.internshala.javaapp;

public class Main {

	public static void main(String[] args) {

		// Assignment Operator
		int income = 30000;
		int bonus = 5000;

//		income = income + bonus;    // income += bonus;
		income += bonus;
		System.out.println(income);

		// Example 2
		int number = 10;
		int x = 2;
//		number = number % x;
		number %= x;
		System.out.println(number);
	}
}
