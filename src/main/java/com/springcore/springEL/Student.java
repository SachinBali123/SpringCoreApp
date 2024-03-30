package com.springcore.springEL;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("studentDemo")
public class Student {
	@Value("#{10 + 85}")
	private int x;
	
	@Value("#{ 45+55-8+5+5*7+22}")
	private int y;
	
	@Value("#{ T(java.lang.Math).sqrt(144)}")
	private double p;
	
	@Value("#{ 226466541 + 55}")
	private Long l;
	
	@Value("#{8>6}")
	private Boolean isActive;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getP() {
		return p;
	}
	public void setP(double p) {
		this.p = p;
	}
	public Long getL() {
		return l;
	}
	public void setL(Long l) {
		this.l = l;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "Student [x=" + x + ", y=" + y + ", p=" + p + ", l=" + l + ", isActive=" + isActive + "]";
	}
	
	
	

}
