// Create an interface called perimeter with a method for calculating the perimeter. Now define this method in the
// Area class of the previous question and use to calculate the perimeter of the Rectangle in the Main class.
import java.util.Scanner;

public class perimeterOfRectangle {
	public static void main (String[] args) {
		perimeter pm = new rectanglePerimeter();
		pm.calculateperimeter();
	}
}
interface perimeter {
	abstract public void calculateperimeter ();
}
class rectanglePerimeter implements perimeter {

	@Override
	public void calculateperimeter() {
		int length, breadth, perim;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		length = sc.nextInt();
		System.out.println("Enter breadth");
		breadth = sc.nextInt();
		perim = 2 * (length + breadth);
		System.out.printf("Perimeter of Rectangle : " + perim);
	}
}
