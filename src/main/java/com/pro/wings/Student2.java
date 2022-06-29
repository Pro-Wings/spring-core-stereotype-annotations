package com.pro.wings;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Student2 {
	int roll;
	String name;

	
	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student2(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student2 [roll=" + roll + ", name=" + name + "]";
	}
	
	

}
