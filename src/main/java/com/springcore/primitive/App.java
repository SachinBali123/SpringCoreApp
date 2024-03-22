package com.springcore.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext appContext = new ClassPathXmlApplicationContext("config.xml");
       Student stud1 = (Student) appContext.getBean("stud1");
       
       System.out.println("\n Student Id : "+ stud1.getStudentId() + "\n Student Name : "+ stud1.getStudentName() + "\n Student Address : "+ stud1.getStudentAddress());
       
       Student stud2 = (Student) appContext.getBean("stud2");
       System.out.println(stud2);

       Student stud3 = (Student) appContext.getBean("stud3");
       System.out.println(stud3);
       
    }
}
