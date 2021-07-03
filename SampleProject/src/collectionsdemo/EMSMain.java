package collectionsdemo;

import java.util.Scanner;

public class EMSMain {

	public static void main(String...strings) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		EmployeeManagementSytem ems = new EmployeeManagementSytem();
		while(ch=='y') {
			System.out.println("Enter the choice");
			System.out.println("add : add new employee ");
			System.out.println("update : update  employee ");
			System.out.println("delete : delete employee ");
			System.out.println("get : get employee ");
			System.out.println("getall : get all employees List ");
			System.out.println("sort : sort employees List ");
			System.out.println("sortbycity : employees sortbycity ");
			System.out.println("sortbystate : employees sortbystate ");
			String choice = sc.next();
			
		switch (choice) {
		case "add":
			ems.addEmployee();
			break;
		case "update":
			ems.updateEmployee();
			break;
		case "delete":
			ems.removeEmployee();
			break;
		case "get":
			ems.getEmployee();
			break;
		case "getall":
			ems.getAllEmployees();
			break;
		case "sort":
			ems.sortEmployeeByName();
		break;
		case "sortbycity":
			ems.sortEmployeeByCity();
		break;
		case "sortbystate":
			ems.sortEmployeeByState();
		break;
		default:
				System.out.println("No such option");
		}
		System.out.println("do you want to continue");
		ch = sc.next().trim().charAt(0);
		}
	}

}
