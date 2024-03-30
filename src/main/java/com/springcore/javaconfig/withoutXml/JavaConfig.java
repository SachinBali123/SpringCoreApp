package com.springcore.javaconfig.withoutXml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig.withoutXml")
public class JavaConfig {
	@Bean
	public Address getAddress() {
		Address address = new Address();
		return address;
	}
	
	
	@Bean
	public Demo getDemo() {
		Demo demo = new Demo(getAddress());
		return demo;
	}
	
	
	

}
