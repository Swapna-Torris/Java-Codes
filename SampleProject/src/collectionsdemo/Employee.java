package collectionsdemo;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	
	private int empId;
	private String empName;
	private static String companyName= "THB";
	private String empCity;
	private String empState;
	private static String country = "India";
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public String getEmpState() {
		return empState;
	}
	public void setEmpState(String empState) {
		this.empState = empState;
	}
	public static String getCountry() {
		return country;
	}
	public static void setCountry(String country) {
		Employee.country = country;
	}
	public Employee(int empId, String empName, String empCity, String empState) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCity = empCity;
		this.empState = empState;
	}
	
	public Employee() {
		super();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empCity == null) ? 0 : empCity.hashCode());
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((empState == null) ? 0 : empState.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empCity == null) {
			if (other.empCity != null)
				return false;
		} else if (!empCity.equals(other.empCity))
			return false;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empState == null) {
			if (other.empState != null)
				return false;
		} else if (!empState.equals(other.empState))
			return false;
		return true;
	}
	
	@Override //annotation = metadata to the compiler
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empCity=" + empCity + ", empState=" + empState
				+ "]";
	}
	
	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		if(empName.equals( emp.getEmpName())){
			return 0;
		}else if(empName.compareTo( emp.getEmpName() )> 0){
			return 1;
		}else 
			return - 1;
		}
	
	
}
