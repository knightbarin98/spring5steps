package com.mrbarin.springcourse.basics.springin5steps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.mrbarin.springcourse.basics.componentscan.ComponentDAO;



@SpringBootApplication
//So we can get components located in a package apart from the class with the SpringBootApplication
@ComponentScan("com.mrbarin.springcourse.basics.componentscan")
public class SpringIn5StepsApplicationComponentScan {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsApplicationComponentScan.class);  

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplicationComponentScan.class, args);
		
		ComponentDAO personDao  = applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}",personDao);
	}

}
