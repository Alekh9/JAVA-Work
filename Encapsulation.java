public class Encapsulation {
	public static void main(String[] args) {
		Students s1 = new Students();
		Students s2 = new Students("Shiva");
		Students s3 = new Students(0001);
	}
}

class Students {
	String name;
	int rollNumber;

	Students() {
		System.out.println("Default or Non-Parameterised Constructor is called.....");
	}

	Students(String name) {
		System.out.println("Parameterised Constructor is called.....");
		this.name = name;
		System.out.println(name);
	}

	Students(int rollNumber) {
		this.rollNumber = rollNumber;
		System.out.println("When we make these different type of Constructor in a class and also called them to execute this phenomenon is called CONSTRUCTOR OVERLOADING.....");
		System.out.println(rollNumber);
	}
}
