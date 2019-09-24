package com.nit.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nit.beans.WishMessageGenerator;

public class WishMessageTest {

	public static void main(String[] args) {
		 
		BeanFactory factory=null;
		WishMessageGenerator bean=null;
		
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nit/cfgs/ApplicationContext.xml"));
		System.out.println("..............");
		
		bean=(WishMessageGenerator)factory.getBean("wmg");
		/*
		System.out.println("Result :: "+bean.messageGenerator("Aaftab"));
	*/}

}
