package com.nt.comps;

public class Student extends Person {
	private int studentID;
	private String course;
	
	public Student(String name, String address, AadharDetails aadhar, int studentID, String course) {
		super(name, address, aadhar);
		System.out.println("Student:: 5-param-constructor");
		this.studentID = studentID;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", course=" + course + "] -----" + super.toString();
	}
	
	

}
