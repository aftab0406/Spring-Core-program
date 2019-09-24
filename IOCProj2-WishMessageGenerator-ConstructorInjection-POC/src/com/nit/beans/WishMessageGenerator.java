package com.nit.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date date;
	
	static {
		System.out.println("WishMessageGenerator::static block");
	}
	
	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator::1-param constructor(-)");
		this.date=date;
	}
	
	public String messageGenerator(String user) {
		
		int hour=0;
		hour=date.getHours();
		
		if(hour<12)
			return "Good Morning "+user;
		else if(hour<=17)
			return "Good AfterNoon "+user;
		else if(hour<=20)
			return "Good Evining "+user;
		else
			return "Good Night "+user;
	}//MessageGenerator(-)
}