package com.internshala.javaapp;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String name;
		int population;
		float populationDensity;
		double GDP;
		char currency;  // '$'
		boolean isSecular;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your country name: ");
		name = scanner.nextLine();

		System.out.println("Enter population: ");
		population = scanner.nextInt();

		System.out.println("Enter currency symbol: ");
		currency = scanner.next().charAt(0);

		System.out.println("Your country name is: " + name);
		System.out.println("The population of the country is : " + population);
		System.out.println("The currency symbol is: " + currency);

		scanner.close();
	}
}
