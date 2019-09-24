package com.nit.Test;

import java.lang.reflect.Constructor;
import java.sql.Date;
import java.util.Calendar;

import com.nit.beans.ConstructorBean;

public class PrivateConstructorTest {

	public static void main(String[] args) {
		
		Class cls=null;
		Constructor[] constructor=null;
		ConstructorBean consbean=null;
		Calendar date=null;
		try {
			//load the class
			date=Calendar.getInstance();
			cls=Class.forName("com.nit.beans.ConstructorBean");
			constructor= ConstructorBean.class.getDeclaredConstructors();
			constructor[0].setAccessible(true);
			consbean=(ConstructorBean)constructor[0].newInstance(date);
			System.out.println(consbean);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
