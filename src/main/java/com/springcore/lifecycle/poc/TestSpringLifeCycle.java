package com.springcore.lifecycle.poc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringLifeCycle {

	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/poc/lifecycle-config.xml");
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/poc/lifecycle-config.xml");
		Animal   animal1 = (Animal)context.getBean("animal1");
		System.out.println(animal1);
		
		System.out.println("================================================");
		
		Birds bird1 = (Birds) context.getBean("bird");
		System.out.println(bird1);
		
		context.registerShutdownHook();	
	}

}
