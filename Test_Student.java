package static_Factory_Method;

import java.util.Scanner;

public class Test_Student {
	public static void main(String[] args) {
		System.out.println("how many students :");
		Scanner sc=new Scanner(System.in);
		int noOfStudents=sc.nextInt();
		for(int i=1;i<=noOfStudents;i++)
		{
			Student student=Student.createStudent();
			System.out.println(student);

		}
		sc.close();
		
	}

}
