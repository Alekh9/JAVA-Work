package com.internshala.javaapp;


public class Main {

	public static void main(String[] args) {

		// Method Overloading: Same method name but different method parameters

		add();  // Method 1

		add(10, 45);    // Method 2

		add(5.6f, 3.2f, 9.6f);    // Method 3
	}

	public static void add() {  // Method 1
		int sum = 5+7;
		System.out.println(sum);
	}

	public static void add(int a, int b) {  // Method 2
		int sum = a + b;
		System.out.println(sum);
	}

	public static void add(float a, float b, float c) {  // Method 3
		float sum = a + b + c;
		System.out.println(sum);
	}
}
