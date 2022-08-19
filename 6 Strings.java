package com.internshala.javaapp;


public class Main {

	public static void main(String[] args) {

		// String Handling

		// Index            0    1    2    3    4    5    6         --> length of 7
		char[] myArray = { 'W', 'e', 'l', 'c', 'o', 'm', 'e' };

		// Using Literals to create String
		String firstString = "Welcome"; // S1
		String secondString = "Welcome";// S1

		// Using new keyword
		String thirdString = new String("Welcome"); // S2

		System.out.println(firstString == secondString);    // Compare Two Objects ..   true .. S1 == S1
		System.out.println(firstString == thirdString);     // Compare Two Objects .. false  .. S1 != S2
		System.out.println(firstString.equals(thirdString));// Compare two values .. true  "Welcome" == "Welcome"

		System.out.println(myArray.length); // 7
		System.out.println(firstString.length());   // 7

		System.out.println(firstString.charAt(6));  // e

		System.out.println(firstString.toUpperCase());  // WELCOME
		System.out.println(firstString.toLowerCase());  // welcome

		System.out.println(firstString.contains("come")); // true

		System.out.println(firstString + " to Internshala");    // Welcome to Internshala
		System.out.println(firstString.concat(" to Internshala"));   // Welcome to Internshala
	}
}
