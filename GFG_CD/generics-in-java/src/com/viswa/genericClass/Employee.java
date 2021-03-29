package com.viswa.genericClass;

public class Employee {
	
	private String fName;
	private String lName;
	private String empId;
	
	
	public Employee() {
		super();
	}
	public Employee(String fName, String lName, String empId) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.empId = empId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Employee [fName=" + fName + ", lName=" + lName + ", empId=" + empId + "]";
	}
	
	

}
