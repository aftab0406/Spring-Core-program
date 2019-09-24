package com.nit.beans;

import java.util.Calendar;

public class ConstructorBean {

	private Calendar date;
	static {
		System.out.println("ConstructorBean::static block");
	}
	
	private ConstructorBean(){
		System.out.println("ConstructorBean::0-param constructor");
	}
	
	private ConstructorBean(Calendar date) {
		this.date=date;
		System.out.println("ConstructorBean::1-param constructor");
	}
	
	public String messageGenerator(String user) {
		
		int hour=0;
		
		hour=Calendar.HOUR_OF_DAY;
		if(hour<12)
			return "Good Morning " + user;
		else if (hour<17) 
			return "Good AfterNoon"+user;
		else if (hour<20)
			return "Good Evining" +user;
		else
			return "Good Night"+user;
	}
	
	@Override
	public String toString() {
		return "ConstructorBean private constructor object is created"; 
	}
}