package com.internshala.javaapp;

public class Main {

	public static void main(String[] args) {

		// IF-ELSE
		boolean isSecular = true;

		String message;
		if (isSecular) {
			message = "India is a secular state";
		} else {
			message = "India is not a secular state";
		}

		System.out.println(message);

		// Ternary Operator     condition? Exp1:Exp2
		String msg = isSecular? "India is a secular state" : "India is not a secular state";
		System.out.println(msg);
	}
}
