package com.internshala.javaapp;


public class Main {

	public static void main(String[] args) {

		/*      WAP for Simple Interest. SI = P * R * T / 100    */

		/* User 1:  principal = 10000, rateOfInterest = 8.7 % , timePeriod = 2 years    */
		double si1 = calculateSimpleInterest(10000, 8.7f, 2);
		System.out.println(si1);

		/* User 2:  principal = 130000, rateOfInterest = 10.5 % , timePeriod = 4 years  */
		double si2 = calculateSimpleInterest(130000, 10.5f, 4);
		System.out.println(si2);

		// User 3:
		double si3 = calculateSimpleInterest(4000, 12.7f, 8);
		System.out.println(si3);
	}

	public static double calculateSimpleInterest(int principal, float rateOfInterest, int timePeriod) {

		double si = principal * rateOfInterest * timePeriod / 100;
		return si;
	}
}
