// this is the raw code of the target class - we have used constructor injection main objective is to understand what is ambiguity problem
package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	// HAS-A property
	private LocalDateTime dateTime;
	
	// performing constructor injection
	@Autowired
	public WishMessageGenerator(LocalDateTime dateTime)
	{
		this.dateTime = dateTime;
	}
	

	public String generateWishMessage(String user)
	{
		int hour = dateTime.getHour();
		
		if(hour < 12)
			return "Good morning: " + user;
		
		else if(hour >=12 && hour < 16)
			return "Good afternoon: " + user;
		
		else if(hour >=16 && hour < 20)
			return "Good evening: " + user;
		
		else 
			return "Good night: " + user;
	}
}
