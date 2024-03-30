package com.springcore.javaconfig.withoutXml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Demo {
	@Value("Sachin")
	private String name;
	
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Demo(Address address) {
		super();
		this.address = address;
	}

	public void show() {
		this.address.displayAddress();
		System.out.println(name + " Is Studing the Java Spring");
	}

}
