public class ClassesAndObjects {
	public static void main(String[] args) {
		Pen p1 =new Pen();
		p1.setColor("Blue");
		System.out.println(p1.color);
		p1.setTip(5);
		System.out.println(p1.tip);
		Student s1 = new Student();
		s1.name = "Abcd";
		System.out.println(s1.name);
		System.out.println(s1.percentage(60, 60, 60));
		System.out.println("Example of Classes & Objects");

		BankAccount account = new BankAccount();
		account.username ="Shraddha Didi";
		System.out.println(account.username);

	}
}


class BankAccount {
	public String username;
	private String password;
	public void setPassword(String pwd) {
		password = pwd;
	}
}

class Student {
	String name;
	int age;
	float percentage;
	float percentage (int phy, int chem, int maths) {
		percentage = (phy + chem + maths) / 3;
		return percentage;
	}
}

class Pen{
	String color;
	int tip;
	void setColor(String newColor) {
		color = newColor;
	}
	void setTip(int newTip) {
		tip = newTip;
	}
}