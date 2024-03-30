package com.springcore.javaconfig.withoutXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestWitOutXML {

	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Demo demo = (Demo)context.getBean("getDemo", Demo.class);
		demo.show();
		Address address = (Address)context.getBean("getAddress", Address.class);
		address.displayAddress();
	}

}
