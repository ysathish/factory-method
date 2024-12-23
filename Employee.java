package static_Factory_Method;

import java.util.Scanner;

public class Employee
{
	private int id;
	private String name;
	private double salary;
	private String department;
	public Employee(int id, String name, double salary, String department) 
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public static Employee  createEmployee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id:");
		int eId=sc.nextInt();
		System.out.println("Enter Employee name:");
		String eName=sc.next();
		System.out.println("Enter Employee salary:");
		double eSalary=sc.nextDouble();
		System.out.println("Enter Employee department:");
		String eDepartment=sc.next();
		
		return new Employee(eId,eName,eSalary,eDepartment);
	}
	public  double calculateAnnualSalary() 
	{
		double annualSalary=(salary*12);
		double bonus=0;
		switch(department)
		{
		case "sales":
			 bonus=annualSalary*0.15;
			break;
		case "engineering":
			 bonus=annualSalary*0.10;
			break;
		case "hr":
			bonus=annualSalary*0.8;
			break;
		default:
			bonus=annualSalary*0.05;
			break;


		}
		double annualSalaryWithBonus=annualSalary+bonus;
		return annualSalaryWithBonus;

	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ ", annual Salary With Bonus" + calculateAnnualSalary() + "]";
	}

}
