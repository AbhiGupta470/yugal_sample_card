package com.nt.comps;

public class Customer extends Person{
	private double billAmount;
	private String transactionId;
	
	public Customer(String name, String address, AadharDetails aadhar, double billAmount, String transactionId) {
		super(name, address, aadhar);
		System.out.println("Customer:: 5-param constructor");
		this.billAmount = billAmount;
		this.transactionId = transactionId;
	}

	@Override
	public String toString() {
		return "Customer [billAmount=" + billAmount + ", transactionId=" + transactionId + "]-----> " + super.toString();
	}
 
	
}
