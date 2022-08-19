import java.util.Scanner;

//Calculate the area of different figures like rectangle, square, circle. Input the operands by the user for
// side length or radius. For performing the same create a different class Area and make the methods for the different figures.
// Then in the Main class, use the Area class to perform these operations. Example - Input: Radius = 3   Output: 28.26
interface Shape {
	void input();
	void area();
}
class Circle implements Shape {
	int r = 0;
	double pi = 3.14, ar = 0;
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of a circle :");
		r = sc.nextInt();
	}
	@Override
	public void area() {
		ar = pi * r * r;
		System.out.println("Area of circle:" + ar);
	}
}
class Square implements Shape {
	int s = 0, ar = 0;
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of a square :");
		s = sc.nextInt();
	}
	@Override
	public void area() {
		ar = s * s;
		System.out.println("Area of Square:" + ar);
	}
}
class Rectangle implements Shape {
	int l = 0, b = 0;
	double ar;
	public void input() {
		//super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of a rectangle :");
		l = sc.nextInt();
		System.out.println("Enter breadth of a rectangle :");
		b = sc.nextInt();
	}
	public void area()  {
		//super.area();
		ar = l * b;
		System.out.println("Area of rectangle:" + ar);
	}
}
class Shapes {
	public static void main(String[] args)  {
		Circle cr = new Circle();
		cr.input();
		cr.area();
		Rectangle rt = new Rectangle();
		rt.input();
		rt.area();
		Square sq = new Square();
		sq.input();
		sq.area();
	}
}