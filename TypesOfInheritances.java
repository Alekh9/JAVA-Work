public class TypesOfInheritances {
	public static void main(String[] args) {
		Dog lily = new Dog();
		lily.eat();
		lily.legs = 4;
		System.out.println(lily.legs);
		Fishes nemo = new Fishes();
		nemo.swim();
		Birds parrot = new Birds();
		parrot.fly();
	}
}
// MULTILEVEL INHERITANCE
class Mammals extends Animal{
	int legs;
}
class Dog extends Mammals {
	String breed;
}

// HIERARCHICAL INHERITANCE

class Fishes extends Animal {
	void swim() {
		System.out.println("swimsss");
	}
}
class Birds extends Animal {
	void fly () {
		System.out.println("Fly");
	}
}