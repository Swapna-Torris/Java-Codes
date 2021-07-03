package collectionsdemo;

import java.util.Comparator;

public class EmpStateComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return (emp1.getEmpState().compareTo(emp2.getEmpState()));
	}

}

