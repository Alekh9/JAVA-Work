package com.internshala.javaapp;


public class Main {

	public static void main(String[] args) {

		System.out.println(Employee.company);   // Calling a static variable

		Employee.count = 20;                    // Updating the value of static variable
		System.out.println(Employee.count);     // Calling a static variable

		Employee.myFirstStaticMethod();         // Invoking a static method
	}
}

class Employee {

	public String name;        // It will vary for each employee object

	public static final String company = "Internshala";  // Constant Value. It belongs to Class not to a object.
	public static int count = 0;    // Class Variable.

	public static void myFirstStaticMethod() {  // Class Method.
		System.out.println("My first static method");

		System.out.println(Employee.count);

		Employee.test();
	}

	public static void test() {
		// Your code..
	}
}

/*
*   1. static variables
*       * Use ClassName.variableName to access the variables
*           DO NOT use objects to access static variables
*       * It belongs to the Class not the object. So they are called CLASS VARIABLES
*
*   2. static methods
*       * Use ClassName.methodName() to invoke the static method
*           DO NOT use objects to call a static method
*       * It belongs to the Class not the object. So they are called CLASS METHODS
*       * static method can only access static class variables.
*       * static method can only invoke a static class methods.
* */
