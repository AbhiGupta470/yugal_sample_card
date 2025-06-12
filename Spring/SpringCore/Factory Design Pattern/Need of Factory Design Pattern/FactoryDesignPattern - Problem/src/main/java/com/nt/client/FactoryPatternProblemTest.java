package com.nt.client;

import com.nt.comps.AadharDetails;
import com.nt.comps.Customer;
import com.nt.comps.Employee;
import com.nt.comps.Person;
import com.nt.comps.Student;

// Here the client should know how to create Dependent AadharDetails and target Employee, Student class objects having AadharDetails class object..
// it will be burden to the programmer
// to overcome this problem use FactoryPattern
public class FactoryPatternProblemTest {
	public static void main(String[] args) {
		AadharDetails details = new AadharDetails(457977546234L, 23, 7007290183L); // dependent class object
		// target class having dependent class object
		Person student = new Student("Abhi", "Noida", details, 2555, "NTSP");
		System.out.println(student);
		
		System.out.println("++++++++++++++++++++++++++=");
		
		AadharDetails details1 = new AadharDetails(557977546234L, 20, 7007825557L); // dependent class object
		Person employee = new Employee("Shubh", "Jhansi", details1, 2556, "Senior Manager");
		System.out.println(employee);
		
		System.out.println("++++++++++++++++++");
		
		
		AadharDetails details2 = new AadharDetails(65797754624L, 50, 8765111680L); // dependent class object
		Person customer = new Customer("Suvidha", "Jhansi", details2, 450.56, "TSC433Paytm");
		System.out.println(customer);
	}
}
