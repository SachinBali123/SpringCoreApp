/**
 * 
 */
package com.springcore.ci;

import java.util.List;

/**
 * 
 */
public class Person {
	
	private int personId;
	private String personName;
	private Dept deptObj;
	private List<String> list;
	
	public Person(int personId, String personName,Dept deptObj, List<String> list ) {
		this.personId = personId;
		this.personName = personName;
		this.deptObj = deptObj;
		this.list = list;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", deptObj ="+ deptObj +", List = " + list +"]";
	}
	
	

}
