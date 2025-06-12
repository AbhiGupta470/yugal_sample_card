// AadharDetails.java (Dependent class)

package com.nt.comps;

public class AadharDetails {
	private long aadharNumber;
	private int age;
	private long mobileNumber;
	
	// ALt+shift + S, O (to get parameterized constructor)
	public AadharDetails(long aadharNumber, int age, long mobileNumber) {
		System.out.println("AadharDetails.AadharDetails()");
		this.aadharNumber = aadharNumber;
		this.age = age;
		this.mobileNumber = mobileNumber;
	}

	// ALt-shift+s+,s ( to get toString method)
	@Override
	public String toString() {
		return "AadharDetails [aadharNumber=" + aadharNumber + ", age=" + age + ", mobileNumber=" + mobileNumber + "]";
	}
		
}
