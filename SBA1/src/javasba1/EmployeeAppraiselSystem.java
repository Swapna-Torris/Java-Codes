package javasba1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EmployeeAppraiselSystem {

	static float totalApprAmt = 0;
	ArrayList<Employee> empList = new ArrayList<Employee>();
	private String[] ratings = { "Average", "Above Average", "Outstanding", "Below Average" };
	private String[] department = { "HR", "Accounting", "IT", "Sales" };
	SimpleDateFormat obj = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
	Scanner sc = new Scanner(System.in);
	// Employee[] empArray = new Employee[2];
	Employee emp;

	public List<Employee> addEmployee() throws ParseException {
		// for(int i=0;i<empArray.length;i++) {
		emp = new Employee();
		System.out.println("Enter the employee details");
		System.out.println("Enter the empid");
		emp.setEmpId(sc.nextInt());
		System.out.println("Enter the empName");
		sc.nextLine();
		emp.setEmpName(sc.nextLine());
		System.out.println("Enter the empSalary");
		emp.setEmpSalary(sc.nextFloat());
		System.out.println("Setting the empRating");
		emp.setEmpRating(ratings[new Random().nextInt(ratings.length)]);
		System.out.println("Setting the empDepartment");
		emp.setEmpDept(department[new Random().nextInt(department.length)]);
		System.out.println("Enter the Date of Joining ('dd/MM/yyyy')");
		String doj = sc.next();
		emp.setDOJ(new SimpleDateFormat("dd/MM/yyyy").parse(doj));
		empList.add(emp);
		// }
		return empList;
	}

	// Iterator<Employee> empItr =empList.iterator();
	public void getEmployees() {
		System.out.println("The employee List : ");
		for (int i = 0; i < empList.size(); i++) {
			Employee emp = empList.get(i);
			System.out.println(emp.getEmpId() + "\t\t" + emp.getEmpName() + "\t\t" + emp.getEmpSalary() + "\t\t"
					+ emp.getEmpRating() + "\t\t" + emp.getEmpDept());
		}
	}

	public void updateEmployee() {
		System.out.println("Enter the Employee Id to update");
		int id = sc.nextInt();
		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).getEmpId() == id) {
				System.out.println("do you want to change employee name or salary ");
				System.out.println("Enter the Employee name");
				sc.nextLine();
				String ename = sc.nextLine();
				empList.get(i).setEmpName(ename);
			}
		}
	}

	public void removeEmployee() {
		System.out.println("Enter the Employee Id to remove");
		int id = sc.nextInt();
		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).getEmpId() == id) {
				empList.remove(i);
			}
		}
	}

	public void getEmployee() {
		Employee emp = null;
		System.out.println("Enter the Employee Id to View");
		int id = sc.nextInt();
		for (int i = 0; i < empList.size(); i++) {
			if (empList.get(i).getEmpId() == id) {
				emp = empList.get(i);
			}
		}
		System.out.println(emp.getEmpId() + "\t\t" + emp.getEmpName() + "\t\t" + emp.getEmpSalary() + "\t\t"
				+ emp.getEmpRating() + "\t\t" + emp.getEmpDept());
	}

	List<Employee> apprEmpList = new ArrayList<Employee>();

	public List<Employee> calculateAppraisal() {
		float apprAmt = 0;
		for (int i = 0; i < empList.size(); i++) {
			String edept = empList.get(i).getEmpDept();
			int noOfYrs = new Date().getYear() - empList.get(i).getDOJ().getYear();
			System.out.println(noOfYrs);
			if ((!((empList.get(i).getEmpRating()).equals("Below Average"))) && ((noOfYrs) > 2)) {
				switch (edept) {
				case "HR":
					apprAmt = empList.get(i).getEmpSalary() * 0.02f;
					totalApprAmt = totalApprAmt + apprAmt;
					break;
				case "Accounting":
					apprAmt = empList.get(i).getEmpSalary() * 0.03f;
					totalApprAmt = totalApprAmt + apprAmt;
					break;
				case "Sales":
					apprAmt = empList.get(i).getEmpSalary() * 0.08f;
					totalApprAmt = totalApprAmt + apprAmt;
					break;
				case "IT":
					apprAmt = empList.get(i).getEmpSalary() * 0.05f;
					totalApprAmt = totalApprAmt + apprAmt;
					break;
				}
				empList.get(i).setEmpSalary(empList.get(i).getEmpSalary() + apprAmt);
				apprEmpList.add(empList.get(i));
			}
			
		}
		return apprEmpList;
	}

	public void getAppraisalReport() {
		List<Employee> elist = calculateAppraisal();
		for (int i = 0; i < elist.size(); i++) {
			System.out.println(elist.get(i).getEmpId() + "\t\t" + elist.get(i).getEmpName() + "\t\t" + elist.get(i).getEmpSalary() + "\t\t"
					+ elist.get(i).getEmpRating() + "\t\t" + elist.get(i).getEmpDept());
		}
	}

	public float calculateAvgBonus() {
		return totalApprAmt ;
	}
}
