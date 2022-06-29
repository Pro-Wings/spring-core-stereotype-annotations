package com.pro.wings;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {
	
	public static void main(String[] args) {
		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Student2 std = ctx.getBean("std1",Student2.class);
		
		System.out.println(std);

				
//		Employee emp1 = ctx.getBean("employee", Employee.class);
//
//		Employee emp2 = ctx.getBean("employee", Employee.class);
//
//		System.out.println(emp1 == emp2);
//		System.out.println(emp1);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		String[] names = ctx.getBeanDefinitionNames();
		System.out.println(Arrays.toString(names));
		
Employee emp = ctx.getBean(Employee.class);
		
		System.out.println(emp);

	}

}
