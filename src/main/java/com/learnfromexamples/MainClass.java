package com.learnfromexamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MainClass extends SpringBootServletInitializer{
/*	T first;
	V second;
 
	

	public MainClass(T first, V second) {
		super();
		this.first = first;
		this.second = second;
	}


	static <T> void print(T object) {
		System.out.println(object.getClass().get);
	}*/

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(MainClass.class);
	}
	
	public static void main(String[] args) {
		 SpringApplication.run(MainClass.class, args);
	}
}
