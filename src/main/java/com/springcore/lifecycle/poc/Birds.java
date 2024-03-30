package com.springcore.lifecycle.poc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Birds implements InitializingBean, DisposableBean{
	
	private String name;

	public Birds() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Name Set for Bird " + name);
		this.name = name;
	}

	public Birds(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Birds [name=" + name + "]";
	}

	public void afterPropertiesSet() throws Exception {
		
		System.out.println("In Init Method ");
		
	}

	public void destroy() throws Exception {
		System.out.println("In Destroy Method ");
		
	}
	
}
