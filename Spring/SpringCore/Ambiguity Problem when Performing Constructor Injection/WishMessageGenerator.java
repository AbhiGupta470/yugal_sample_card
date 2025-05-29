package com.nt.sbeans;

import java.util.Date;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	// HAS-A properties
	private LocalDateTime dateTime;
	private Date dt;
	
	// constructor 1 , this is our first constructor
	@Autowired
	public WishMessageGenerator(Date dt)
	{
		this.dt =  dt;
	}
	// constructor 2, this is our second constructor
	@Autowired
	public WishMessageGenerator(LocalDateTime dateTime)
	{
		this.dateTime = dateTime;
	}
	
	// will be an error, the IOC COntainer has gone to a dilemma state it is not able to decide
	// on which constructor the Dependency Injection should take place this is because the constructor
	// injection happens only when at the time of object creation so we cannot allow more than one constructor at the same time for Dependency Injection
	// business methods for business logics
	public String generateWishMessage(String user)
	{
		int hour =  dateTime.getHour();
		if(hour >=7 && hour < 12)
			return "Good morning: " + user;
		else if(hour >=12 && hour <16)
			return "Good afternoon: " + user;
		else if(hour >=16 && hour < 20)
			return "Good evening: " + user;
		else
			return "Good night: " + user;
	}
}
