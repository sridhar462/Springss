package com.learnfromexamples.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.learnfromexamples.bo.IMobService;

public class Samsung {
	@Autowired
	IMobService mobService;
	public void getValue() {
		System.out.print("hello world");
		//mobService.getRate();
	}
}
