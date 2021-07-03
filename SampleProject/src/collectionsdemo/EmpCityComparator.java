package collectionsdemo;

import java.util.Comparator;

public class EmpCityComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return (emp1.getEmpCity().compareTo(emp2.getEmpCity()));
	}

}
