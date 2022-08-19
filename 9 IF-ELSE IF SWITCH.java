package com.internshala.javaapp;

public class Main {

	public static void main(String[] args) {

		// IF-ELSE IF
		int score = 73;

		char grade;

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("Grade: " + grade);

		// SWITCH
		switch (grade) {

			case 'A':
				System.out.println("Excellent Score.");
				break;
			case 'B':
				System.out.println("Very Good Score.");
				break;
			case 'C':
				System.out.println("Good Score. You can do better.");
				break;
			case 'D':
				System.out.println("Average Score. Work hard.");
				break;
			case 'F':
				System.out.println("You have failed");
				break;
			default:
				System.out.println("Invalid Grade");
		}


	}
}
