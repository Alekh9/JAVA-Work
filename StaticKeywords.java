public class StaticKeywords {
	public static void main(String[] args) {
		StudentS s1 = new StudentS();
		s1.SchoolName = "JMD";
		StudentS s2 = new StudentS();
		System.out.println(s2.SchoolName);
	}
}
class StudentS {
	String name;
	int rollNumbers;
	static String SchoolName;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
