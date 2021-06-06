package com.mrbarin.springcourse.basics.springin5steps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.mrbarin.springcourse.basics.componentscan.ComponentDAO;
import com.mrbarin.springcourse.basics.springin5steps.cdi.SomeCdiBussiness;



@SpringBootApplication
public class SpringIn5StepsApplicationCdi {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsApplicationCdi.class);  

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplicationCdi.class, args);
		
		SomeCdiBussiness bussiness  = applicationContext.getBean(SomeCdiBussiness.class);
		
		LOGGER.info("{} dao-{}",bussiness, bussiness.getSomeCdiDao());
	}

}
