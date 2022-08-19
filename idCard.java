import java.util.*;

public class idCard {

	public static void main(String[] args) {
		String name, bloodGroup, group;
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name ");
		name = sc.nextLine();
		System.out.println("Enter your blood group ");
		bloodGroup = sc.nextLine();
		System.out.println("Enter your age ");
		age = sc.nextInt();

	//	Scanner.close();
		if (age >= 20) {
			group = "you are in group RED";
		} else if (age >=15 && age < 20 ) {
			group = "you are in group BLUE";
		} else if (age >= 10 && age < 15) {
			group = "you are in group YELLOW";
		} else {
			group = "NO GROUP";
		}
		System.out.println("----------------------------");
		System.out.println("  Name: " + name);
		System.out.println("  Age: " + age);
		System.out.println("  Blood Group: " + bloodGroup);
		System.out.println("----------------------------");
		System.out.println("   Your group is " + group);
		System.out.println("----------------------------");
	}
}