public class Abstraction {
	public static void main(String[] args) {
		Horse h = new Horse();
		h.eat();
		h.walks();
		Chicken c = new Chicken();
		c.eat();
		c.walks();
		Mustang myHorse = new Mustang();
	}
}
abstract class Animals {
	// Abstract Class have constructors
	Animals () {
		System.out.println("Animals Super class constructor is called......");
	}
	void eat() {
		System.out.println("Animals Eat");
	}
	abstract void walks(); // ABstract Method Have NO BOdy (Implementations)
}
// Method Overriding --> Parents and child classes both have same functions with different definitions

class Horse extends Animals {
	Horse () {
		System.out.println("Horse Child class constructor is called......");
	}
	@Override
	void walks() {
		System.out.println("Horse walks on 4 legs...");
	}
}
class Mustang extends Horse {
	Mustang () {
		System.out.println("Mustang Child class contructor of Horse Child class constructor is called......");
	}
}
class Chicken extends Animals {
	@Override
	void walks() {
		System.out.println("Horse walks on 2 legs...");
	}
}