package com.internshala.javaapp;


public class Main {

	public static void main(String[] args) {

		// Exception Handling

		System.out.println("Program Starts");   // Executed

		int[] myArray = { 3, 45, 8, 10 };

		try {
			int result = myArray[1] / 0;           // ArithmeticException
			System.out.println(myArray[0]);        // ArrayIndexOutOfBoundsException Occurred
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException exception) {
			// Your Code.. Optional
			System.out.println(exception);
		} finally {
			System.out.println("The finally block is always executed");
		}

		try {
			String s = null; // No Object
			System.out.println(s.length());
		} catch (Exception ex) {    // General Exception
			System.out.println(ex);
		}

		System.out.println("Program Ends");     // Executed
	}
}
