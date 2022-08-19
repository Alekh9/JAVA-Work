
package com.internshala.javaapp;

public class Main {

	public static void main(String[] args) {

		// population is 1326572000
		// populationDensity is 393.0 per square km
		// GDP is 2.454 trillion dollar
		// currency ₹
		// is Secular State

		String name = "India";
		int population = 1326572000;
		float populationDensity = 393.0f;  // per square km
		double GDP = 2.454;    // trillion dollar
		char currency = '₹';    //  ₹ OR \u20B9
		boolean isSecular = true;

		System.out.println('\u20B9');
		// India is a secular state with population of 1326572000
		// and population density of 393.0 person per sq km. It has
		// annual GDP of 2.454 trillion dollar and its currency symbol is ₹.
	}
}
		