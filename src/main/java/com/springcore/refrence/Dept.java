/**
 * 
 */
package com.springcore.refrence;

/**
 * 
 */
public class Dept {
	private int deptId;
	private String deptName;
	private Employee empObj;
	
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Employee getEmpObj() {
		return empObj;
	}
	public void setEmpObj(Employee empObj) {
		this.empObj = empObj;
	}
	public Dept(int deptId, String deptName, Employee empObj) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.empObj = empObj;
	}
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
}
