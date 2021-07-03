package firstjavaprogram;

import java.util.Scanner;

public class Employee {
	//instance variables
	int empid;
	String empName;
	float salary;
	/*
	 * readEmpDetails() method is used to read the emp details
	 */
	Scanner sc = new Scanner(System.in);
	//instance methods 
	public void readEmpDetails() {
		System.out.println("Enter the employee id");
		empid = sc.nextInt();
		System.out.println("Enter the employee name");
		empName = sc.next();
		System.out.println("Enter the salary of employee");
		salary = sc.nextFloat();
	}
	
	public void displayEmpDetails() {
		System.out.println("Employee id = " + empid);
		 
		System.out.println("Employee name = " +empName);

		System.out.println("Salary of employee = " + salary);

	}

}
