package com.mrbarin.springcourse.basics.springin5steps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mrbarin.springcourse.basics.springin5steps.scope.PersonDAO;

@SpringBootApplication
public class SpringIn5StepsApplicationScope {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsApplicationScope.class);  

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplicationScope.class, args);
		
		PersonDAO personDao  = applicationContext.getBean(PersonDAO.class);
		
		PersonDAO personDao2  = applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}",personDao);
		LOGGER.info("{}",personDao.getJdbcConnection());
		
		LOGGER.info("{}",personDao2);
		LOGGER.info("{}",personDao2.getJdbcConnection());
	}

}
