package com.nit.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nit.beans.WishMessageGenerator;

public class WishMessageGeneratorTest {

	public static void main(String[] args) {
		
		Resource resource=null;
		//FileSystemResource resource=null;
		XmlBeanFactory factory=null;
		WishMessageGenerator bean=null;
		
		resource=new FileSystemResource("src/com/nit/cfgs/applicationContext.xml");
		factory=new XmlBeanFactory(resource);
		bean=(WishMessageGenerator)factory.getBean("wmg");
		System.out.println(bean.messageGenerator("Aaftab"));
		
	}

}
