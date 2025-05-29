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

  // to solve the Ambuguity Problem of Contructor Injection we can create only a single constructor comprising of N number of parameters
	// constructor 1 , this is our first constructor
	@Autowired
	public WishMessageGenerator(LocalDateTime dateTime, Date dt)
	{
		this.dateTime = dateTime;
		this.dt =  dt;
	}
	
	
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
