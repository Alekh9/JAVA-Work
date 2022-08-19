package com.internshala.javaapp;

public class Main {

	public static void main(String[] args) {

		// WAP to print all numbers in array along with this find out sum of all elements in the array.

        // Index               0    1  2   3
        int[] myFirstArray = { 20, 19, 48, 7 };

        int sum = 0;
        for (int i = 0; i < myFirstArray.length; i++) {

            sum += myFirstArray[i];
            System.out.println(myFirstArray[i]);
        }
        System.out.println("Sum of firstArray: " + sum);


        // Second way to declare an Array
        float[] mySecondArray = new float[3];
        mySecondArray[0] = 34.2f;
        mySecondArray[1] = 4.6f;
        mySecondArray[2] = 78.11f;

        float sumOfNumbers = 0;
        for (float num: mySecondArray) {        // For Each Loop
            sumOfNumbers += num;
            System.out.println(num);
        }
        System.out.println("Sum of secondArray: " + sumOfNumbers);
	}
}
