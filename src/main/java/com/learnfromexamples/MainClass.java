package com.learnfromexamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainClass<T,V> {
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

	public static void main(String[] args) {
		 SpringApplication.run(MainClass.class, args);
	}
}
