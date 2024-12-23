package static_Factory_Method;

import java.util.Scanner;

public class Student
{
	private String name;
	private int age;
	private String grade;
	  
	public Student(String name,int age,String grade)
	{
		super();
		this.name=name;
		this.age=age;
		this.grade=grade;
	}
	static Student createStudent() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name:");
		String sName=sc.next();
		System.out.println("Enter Student Age:");
		int sAge=sc.nextInt();
		System.out.println("Enter Student Grade:");
		String sGrade=sc.next();
//		sc.close();
		return new Student(sName,sAge,sGrade);
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
 
}
