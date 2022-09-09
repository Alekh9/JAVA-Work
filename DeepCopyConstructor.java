public class DeepCopyConstructor {
	private static CollegeStudentss s2;

	public static void main(String[] args) {
		/*CollegeStudentss s1 = new CollegeStudentss(s1);
		s1.marks[0] = 15500;
		s1.marks[1] = 9780;
		s1.marks[2] = 8360; */
	}
}
class CollegeStudentss {
	String name;
	int rollNumber;
	int marks[];
	CollegeStudentss(CollegeStudentss s2) {
		this.name =s2.name;
		this.rollNumber = s2.rollNumber;
		marks = new int[3];
		this.marks = s2.marks;
	}
}