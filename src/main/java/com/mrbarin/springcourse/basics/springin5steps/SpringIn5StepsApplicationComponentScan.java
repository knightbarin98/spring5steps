package com.mrbarin.springcourse.basics.springin5steps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.mrbarin.springcourse.basics.componentscan.ComponentDAO;
import org.springframework.context.annotation.Configuration;


@Configuration
//So we can get components located in a package apart from the class with the SpringBootApplication
@ComponentScan("com.mrbarin.springcourse.basics.componentscan")
public class SpringIn5StepsApplicationComponentScan {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsApplicationComponentScan.class);  

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext
				= new AnnotationConfigApplicationContext(SpringIn5StepsApplicationComponentScan.class)) {

			ComponentDAO personDao = applicationContext.getBean(ComponentDAO.class);

			LOGGER.info("{}", personDao);
		}
	}

}
