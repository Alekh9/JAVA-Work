public class CopyOrShallowConstructor {
	public static void main(String[] args) {
		CollegeStudents s1 = new CollegeStudents();
		s1.name = "Shaadha Didi";
		s1.rollNumber = 159;
		s1.password="xyz";
		s1.marks[0] = 100;
		s1.marks[1] = 90;
		s1.marks[2] = 80;

		CollegeStudents s2 = new CollegeStudents(s1);
		s1.password = "ABCD";
		s1.marks[2]= 999;
		for (int i = 0; i < 3; i ++) {
			System.out.println(s2.marks[i]);
		}
	}
}
class CollegeStudents {
	String name;
	int rollNumber;
	String password;
	int marks[];
	CollegeStudents() {
		marks = new int[3];
		System.out.println("Default or Non-Parameterised Constructor is called.....");
	}

	CollegeStudents(String name) {
		marks = new int[3];
		System.out.println("Parameterised Constructor is called.....");
		this.name = name;
		System.out.println(name);
	}

	CollegeStudents(int rollNumber) {
		marks = new int[3];
		this.rollNumber = rollNumber;
		System.out.println("When we make these different type of Constructor in a class and also called them to execute this phenomenon is called CONSTRUCTOR OVERLOADING.....");
		System.out.println(rollNumber);
	}
	CollegeStudents(CollegeStudents s1) {
		this.name =s1.name;
		this.rollNumber = s1.rollNumber;
		marks = new int[3];
		this.marks = s1.marks;
	}
}