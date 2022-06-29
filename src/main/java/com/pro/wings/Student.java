package com.pro.wings;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Student {
	@Value("10")
	int roll;
	@Value("Ram")
	String name;
	@Value("#{subjects}")
	List<String> subjects;
	
	
	public Student(int roll, String name, List<String> subjects) {
		super();
		this.roll = roll;
		this.name = name;
		this.subjects = subjects;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
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
	
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", subjects=" + subjects + "]";
	}

	
	

}
