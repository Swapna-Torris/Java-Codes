package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeManagementSytem implements IEmployeeManagementSystem {

	ArrayList< Employee> empList = new ArrayList<Employee>();
	Scanner sc= new Scanner(System.in);
	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		empList.add(new Employee(123,"Rama","Bangalore","Karnataka"));
		empList.add(new Employee(124,"Ramji","Hyderabad","Telangana"));
		empList.add(new Employee(125,"Ram","Chennai","Tamilnadu"));
		empList.add(new Employee(126,"Raam","Delhi","UP"));
	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Enter the empid to update");
		int eid = sc.nextInt();
		for(int i=0;i<empList.size();i++) {
			if(empList.get(i).getEmpId() == eid) {
				empList.get(i).setEmpCity("Trivandrum");
				empList.get(i).setEmpState("Kerala");
			}
		}
		
	}

	@Override
	public void removeEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Enter the empid to delete");
		int eid = sc.nextInt();
		for(int i=0;i<empList.size();i++) {
			if(empList.get(i).getEmpId() == eid) {
			empList.remove(empList.get(i));
		}
		}
	}

	@Override
	public void getEmployee() {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		System.out.println("Enter the empid to read");
		int eid = sc.nextInt();
		for(int i=0;i<empList.size();i++) {
			if(empList.get(i).getEmpId() == eid) {
				emp = empList.get(i);
			}
			}
		if(emp != null) {
			System.out.println("Employee id = " + emp.getEmpId());
			System.out.println("Employee id = " + emp.getEmpName());
			System.out.println("Employee id = " + emp.getEmpState());
		}else {
			System.out.println("Employee not found");
		}
		
	}

	@Override
	public void getAllEmployees() {
		// TODO Auto-generated method stub
		System.out.println("Employee List ......");
		for(int i=0;i<empList.size();i++) {
				System.out.println("Employee id = " + empList.get(i).getEmpId());
				System.out.println("Employee id = " +empList.get(i).getEmpName());
				System.out.println("Employee id = " +empList.get(i).getEmpState());
			
			}
	}

	@Override
	public void sortEmployeeByName() {
		// TODO Auto-generated method stub
			Collections.sort(empList);
			Iterator<Employee> empItr = empList.iterator();
			while(empItr.hasNext()) {
				Employee emp = empItr.next();
				System.out.println(emp.getEmpId()+"\t"+emp.getEmpName()+"\t"+emp.getEmpCity()+"\t"+emp.getEmpName());
			}
	}
	
	public void sortEmployeeByCity() {
		Collections.sort(empList, new EmpCityComparator());
		Iterator<Employee> empItr = empList.iterator();
		while(empItr.hasNext()) {
		System.out.println(empItr.next().getEmpCity());
		}
	}
	
	public void sortEmployeeByState() {
		Collections.sort(empList, new EmpStateComparator());
		Iterator<Employee> empItr = empList.iterator();
		while(empItr.hasNext()) {
		System.out.println(empItr.next().getEmpState());
		}
	}

}
