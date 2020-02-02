package com.learnfromexamples.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learnfromexamples.bo.IMobService;
import com.learnfromexamples.bo.MobServiceImpl;
import com.learnfromexamples.service.Samsung;

@Configuration
@ComponentScan(basePackages= {"com.learnfromexamples.bo",})
public class AppConfig {
	
	@Bean
	public Samsung getSamsumg() {
		return new Samsung();
	}
	
	/*@Bean
	public IMobService getService ()
	{
		return new MobServiceImpl();
	}*/
}
