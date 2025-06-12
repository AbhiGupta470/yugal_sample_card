package com.nt.comps;

public class Employee extends Person {
	private int empId;
	private String designation;
	

	public Employee(String name, String address, AadharDetails aadhar, int empId, String designation) {
		super(name, address, aadhar);
		System.out.println("Employee:: 5-param constructor");
		this.empId = empId;
		this.designation = designation;
	}


	@Override
	public String toString() {
		// the purpose of calling super.toString() over here is that so that it should also display properties of super class which is Person 
		return "Employee [empId=" + empId + ", designation=" + designation + "]" + super.toString();
	}
	
	
}
