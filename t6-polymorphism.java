package com.internshala.javaapp;


public class Main {

	public static void main(String[] args) {

		Animal animal1 = new Animal();  // animal1 --> A
		animal1.run();  // Animal is running !

		Animal animal2 = new Dog();  // animal2 --> D       // UPCASTING
		animal2.run();  // Dog is running !
	}
}

class Animal {

	public void run() {
		System.out.println("Animal is running !");
	}
}

class Dog extends Animal {

	public void run() { // Method Overriding
		super.run();
		System.out.println("Dog is running !");
	}
}
