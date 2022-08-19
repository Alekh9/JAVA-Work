package com.internshala.javaapp;


public class Main {

	public static void main(String[] args) {

		/* WAP to find odd numbers from 1 to 4      1, 2, 3 and 4      */

		int number = 1;
		if (number % 2 != 0)
			System.out.println(number);

		number++;   // 2
		if (number % 2 != 0)
			System.out.println(number);

		number++;   // 3
		if (number % 2 != 0)
			System.out.println(number);

		number++;   // 4
		if (number % 2 != 0)
			System.out.println(number);

		// FOR Loop
		for (int num = 1 ; num <= 4; num++) {
			if (num % 2 != 0)
				System.out.println(num);
		}
	}
}
