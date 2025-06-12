// target class
package com.nt.comps;

// the purpose of creating Person class as abstract is that we do not want to create object
// of the person class because in real time a person do not belongs to a Person class
// either that person is a Employee, Student or Customer  
public abstract class Person {
	
	private String name;
	private String address;
	private AadharDetails aadhar;
	
	public Person(String name, String address, AadharDetails aadhar) {
		System.out.println("Person:: 3-param constructor");
		this.name = name;
		this.address = address;
		this.aadhar = aadhar;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", aadhar=" + aadhar + "]";
	}
	
	
	
}
