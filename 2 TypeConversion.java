package com.internshala.javaapp;

public class Main {

	public static void main(String[] args) {

		// Implicit Conversion
		int radius = 400;
		double newRadius = radius;
		System.out.println(newRadius);

		// Explicit Conversion
		double diameter = 3.78;
		int newDiameter = (int) diameter;
		System.out.println(newDiameter);
	}
}
