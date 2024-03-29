package com.springcore.lifecycle.poc;

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;

public class Animal {
	private int id;
	private String name;
	private String type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("\n\n" +name + " Name Set at :- " + LocalTime.now(ZoneId.of("GMT+02:30")));
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(int id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + ", type=" + type + "]";
	}
	
	public void init() {
		System.out.println("Animal Class Initialized at " + LocalTime.now(ZoneId.of("GMT+02:30")));
	}
	
	public void destroy() {
		System.out.println("Animal Class Destroyed/ Dead at " + LocalTime.now(ZoneId.of("GMT+02:30")));
		//System.out.println("Animal Class Destroyed/ Dead at " + Instant.now().toEpochMilli());
	}

}
