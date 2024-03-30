package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
	
	private Long id;
	private String name;
	
	@Autowired
	@Qualifier("address2")
	private Address address;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Inside Setter Injection for  Address");
	}
	
	public Person(Long id, String name, Address address) {
		super();
		System.out.println("Inside Parameterised Person Constructor");
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Person() {
		super();
		System.out.println("Inside Person Constructor");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	public Person(Address address) {
		super();
		System.out.println("Inside Parameterised Person Constructor");
		this.address = address;
	}
	

}
