package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandaloneCollections {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standalone-config.xml");
		
		MyFriends friend1 = (MyFriends) context.getBean("friends");
		
		System.out.println(friend1);
		System.out.println("====================================================");
		System.out.println("My Best Friends Are :->  " +friend1.getFriends());
		System.out.println("Class Name :->  " +friend1.getFriends().getClass().getName());
		System.out.println("====================================================");
		System.out.println("Fees Structure is like :->  " +friend1.getFeeStructure());
		System.out.println("Class Name :->  " +friend1.getFeeStructure().getClass().getName());
		System.out.println("====================================================");
		System.out.println("Properties are like :->  " +friend1.getProps());
		System.out.println("Class Name :->  " +friend1.getProps().getClass().getName());
	}

}
