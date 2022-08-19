package com.internshala.javaapp;


import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> namesList = new ArrayList();
		namesList.add("Sam");   // 0
		namesList.add("Rahul"); // 1
		namesList.add("Mohit"); // 2
		namesList.add("Tony");  // 3

		namesList.remove(1);                // Removes the element "Rahul"
		namesList.add(1, "Peter");  // Add "Peter" at index 1
		namesList.set(1, "Rahul");                // Replace element at index 1 by "Rahul"

		namesList.remove("Mohit");              // Removes object of "Mohit"

//		System.out.println(namesList.get(2));

		// For Each
		for(String name: namesList) {
			System.out.println(name);
		}

		// Create a ArrayList of Employee and print out the names.

		Employee e1 = new Employee("Albert");
		Employee e2 = new Employee("Parul");
		Employee e3 = new Employee("Kamal");

		List<Employee> employeeList = new ArrayList();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);

		for (Employee employee: employeeList) {
			System.out.println(employee.name);
		}
	}
}

class Employee {

	String name;

	public Employee(String name) {
		this.name = name;
	}
}


/*
*   List: Interface
*   ArrayList: Class that implements interface List
*
*       class ArrayList implements List {
*           ...
*       }
*
*   List Properties:
*       1. They can store only objects
*       2. It cannot store primitive data type i.e. you can't store int, float, char etc.
*       3. Elements are present in sequence i.e. they are indexed. Index starts from 0,1,2,3 .... n
*       4. It can contain duplicate elements
*/
