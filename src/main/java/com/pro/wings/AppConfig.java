package com.pro.wings;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.pro.wings")
public class AppConfig {

	@Bean(name="std1")
	@Scope("prototype")
	public Student2 getStudent()
	{
		return new Student2(10, "Ram");
	}
	
	@Bean
	public Student2 getStudent2()
	{
		return new Student2(20, "Sham");
	}
	
}
