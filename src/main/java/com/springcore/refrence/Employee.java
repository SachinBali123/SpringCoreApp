/**
 * 
 */
package com.springcore.refrence;

/**
 * 
 */
public class Employee {
	private int empId;
	private String empName;
	private Dept  deptObj;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Dept getDeptObj() {
		return deptObj;
	}
	public void setDeptObj(Dept deptObj) {
		this.deptObj = deptObj;
	}
	public Employee(int empId, String empName, Dept deptObj) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptObj = deptObj;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
