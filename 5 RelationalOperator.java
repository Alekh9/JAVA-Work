package com.internshala.javaapp;

public class Main {

	public static void main(String[] args) {

		// Relational Operator

		int x = 2;
		int y = 3;
		int z = 3;

		// Greater than and Greater than equal to
		boolean r1 = x > y;     // r1 = false
		boolean r2 = y >= x;    // r2 = true

		// Less than and Less than equal to
		boolean r3 = x < y;     // r3 = true
		boolean r4 = y <= x;    // r4 = false

		// Is equal to and Is NOT equal to
		boolean r5 = y == z;    // r5 = true
		boolean r6 = z != x;    // r6 = true

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		System.out.println(r6);

	}
}
