package javasba1;

import java.util.Date;

public class Employee {
	
	private int empId;
	private String empName;
	private String empRating; //= {"Average","Above Average","Outstanding"} ;
	private float empSalary;
	private String empDept;
	private Date DOJ;
	
	public Employee() {
		super();
	}

	public Employee(int empId, String empName, String empRating, float empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empRating = empRating;
		this.empSalary = empSalary;
	}

	

	public Employee(int empId, String empName, String empRating, float empSalary, String empDept, Date dOJ) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empRating = empRating;
		this.empSalary = empSalary;
		this.empDept = empDept;
		DOJ = dOJ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DOJ == null) ? 0 : DOJ.hashCode());
		result = prime * result + ((empDept == null) ? 0 : empDept.hashCode());
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((empRating == null) ? 0 : empRating.hashCode());
		result = prime * result + Float.floatToIntBits(empSalary);
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
		if (DOJ == null) {
			if (other.DOJ != null)
				return false;
		} else if (!DOJ.equals(other.DOJ))
			return false;
		if (empDept == null) {
			if (other.empDept != null)
				return false;
		} else if (!empDept.equals(other.empDept))
			return false;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empRating == null) {
			if (other.empRating != null)
				return false;
		} else if (!empRating.equals(other.empRating))
			return false;
		if (Float.floatToIntBits(empSalary) != Float.floatToIntBits(other.empSalary))
			return false;
		return true;
	}
	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empRating=" + empRating + ", empSalary="
				+ empSalary + ", empDept=" + empDept + ", DOJ=" + DOJ + "]";
	}

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

	public String getEmpRating() {
		return empRating;
	}

	public void setEmpRating(String empRating) {
		this.empRating = empRating;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public Date getDOJ() {
		return DOJ;
	}

	public void setDOJ(Date dOJ) {
		DOJ = dOJ;
	}
	
}
