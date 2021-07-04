package javasba1;

import java.text.ParseException;
import java.util.Scanner;

public class EASMain {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = 'y';
		EmployeeAppraiselSystem eas = new EmployeeAppraiselSystem();
		while (ch == 'y') {
			System.out.println("Enter the choice");
			System.out.println("add : add new employee ");
			System.out.println("update : update  employee ");
			System.out.println("delete : delete employee ");
			System.out.println("get : get employee ");
			System.out.println("getall : get all employees List ");
			System.out.println("appraisal : appraisal of employees List ");
			System.out.println("report: to view report");
			String choice = sc.next();
			switch (choice) {
			case "add":
				eas.addEmployee();
				break;
			case "update":
				eas.updateEmployee();
				break;
			case "delete":
				eas.removeEmployee();
				break;
			case "getall":
				eas.getEmployees();
				break;
			case "get":
				eas.getEmployee();
				break;
			case "appraisal":
				eas.calculateAppraisal();
				break;
			case "report":
				System.out.println("Enter the choice of the report");
				System.out.println("rappraisal: report of appraisal");
				System.out.println("calculateAvgBonus: total amount of bonus");
				String rchoice = sc.next();
				switch (rchoice) {
				case "rappraisal":
						eas.getAppraisalReport();
					break;
				case "calculateAvgBonus":
						System.out.println("total avg bonus = " + eas.calculateAvgBonus());
					break;
				default:
					break;
				}
				break;
			default:
				System.out.println("No such option");
			}// switch close
			System.out.println("do you want to continue");
			ch = sc.next().trim().charAt(0);
		} // while close
		sc.close();
	}// main close
}
