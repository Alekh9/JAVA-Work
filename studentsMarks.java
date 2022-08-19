import java.io.*;
class Student
{
	int rollno;
	String name;
	int number_of_subjects;
	public int mark[];

	Student(int roll,String stud_name,int noofsub)throws IOException
	{
		rollno=roll;
		name=stud_name;
		number_of_subjects= noofsub;
		getMarks(noofsub);
	}
	public void getMarks(int nosub ) throws IOException
	{
		int[] mark=new int[nosub];
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		for (int i=0; i<nosub;i++)
		{
			System.out.println("Enter " + i +  "Subject Marks :=> ");
			mark[i]=Integer.parseInt(br.readLine());
			System.out.println("");
		}

	}
	public void showMarks()
	{
		System.out.println("Roll Number :=> "+rollno);
		System.out.println("Name Of Student is :=> "+name);
		System.out.println("Number Of Subject :=> "+number_of_subjects);
		for (int i : mark) {
		System.out.println("Number Of Subject :=> "+ mark );
		}

	}
}
class studentsMarks {
	public static void main(String args[])throws IOException
	{
		int rno,no,nostud;
		String name;
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter How many Students:=> ");
		nostud=Integer.parseInt(br.readLine());
		Student s[]=new Student[nostud];

		for(int i=0;i<nostud;i++)
		{
			System.out.println("Enter Roll Number:=> ");
			rno=Integer.parseInt(br.readLine());
			System.out.println("Enter Name:=> ");
			name=br.readLine();
			System.out.println("Enter No of Subject:=> ");
			no=Integer.parseInt(br.readLine());
			s[i]=new Student(rno,name,no);
		}

		for(int i=0;i<nostud;i++)
		{
			s[i].showMarks();
		//	System.out.println("Marks Of Subject :=> "+  );
		}

	}
}