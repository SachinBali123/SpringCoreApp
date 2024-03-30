package com.springcore.springEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringExpressionLanguage {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springEL/spring-el-config.xml");
		Student stud1 = (Student)context.getBean("studentDemo", Student.class);
		System.out.println(stud1);
		
		System.out.println("===============================================");
	
	}

}
