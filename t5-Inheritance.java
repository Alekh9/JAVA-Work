package com.internshala.javaapp;


public class Main {

	public static void main(String[] args) {

		// NOTE: Always use GETTER and SETTER. This sample code is meant to explain Inheritance concept.
		Dog dog = new Dog();
		dog.name = "Labrador";
		dog.color = "Black";
		dog.bark();
		dog.run();

		Cat cat = new Cat();
		cat.name = "Persian cat";
		cat.pattern = "tabby";
		cat.meow();
		cat.run();

		Animal animal = new Animal();
		animal.name = "my animal";
		animal.run();
	}
}

class Animal {

	String name;

	public void run() {
		System.out.println("Animal is running !");
	}
}

class Dog extends Animal {

	String color;

	public void bark() {
		System.out.println("Wooh ! Wooh !");
	}
}

class Cat extends Animal {

	String pattern;

	public void meow() {
		System.out.println("Meow ! Meow !");
	}
}
