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
	
	@Autowired(required=false) // this is the code earlier this attribute used to play it's role but from Spring 5.x this is of no use
	public WishMessageGenerator(LocalDateTime dateTime,Date dt)
	{
		this.dateTime = dateTime;
		this.dt =  dt;
	}
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
