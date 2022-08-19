package com.internshala.javaapp;

public class Main {

	public static void main(String[] args) {

		// Increment and Decrement Operator

		// Postfix  : First use the value and then increment/decrement
		// Prefix   : First increment/decrement and then use the value

		int age = 10;
		System.out.println(age++);  // 10
		// age = age + 1    => age = 11
		System.out.println(age);    // 11

		System.out.println(++age);  // 12
		System.out.println(age);    // 12

		// age = 12
		System.out.println(age-- + --age);  // 12 + 10 = 22
	}
}
