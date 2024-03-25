package com.springcore.refrence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRefrence {

	public static void main(String[] args) {
		

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/springcore/refrence/refrence-config.xml");
		 Employee employee = (Employee) appContext.getBean("emp");
		 
		 System.out.println("Emp Id :-> " + employee.getEmpId());
		 System.out.println("Emp Name :-> " +employee.getEmpName());
		 System.out.println("Dept Name of the Employee Is "+ employee.getEmpName() + " And the Dept is " + employee.getDeptObj().getDeptName());
		 
		 
		
	}

}
