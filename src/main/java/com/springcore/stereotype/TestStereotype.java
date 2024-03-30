package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStereotype {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereo-config.xml");
		
		Student stud1 = (Student)context.getBean("studentObject", Student.class);
		System.out.println(stud1);
		
		System.out.println(stud1.getStudentName());
		System.out.println(stud1.getCity());
		System.out.println(stud1.getAddresses());
		System.out.println("===============================================");
		System.out.println(stud1.getClass().getName());
		System.out.println(stud1.getAddresses().getClass().getName());
	}

}
