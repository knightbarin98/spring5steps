package com.mrbarin.springcourse.basics.springin5steps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.mrbarin.springcourse.basics.springin5steps.scope.PersonDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.mrbarin.springcourse.basics.springin5steps")
public class SpringIn5StepsApplicationScope {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsApplicationScope.class);

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext
                     = new AnnotationConfigApplicationContext(SpringIn5StepsApplicationScope.class)) {

            PersonDAO personDao = applicationContext.getBean(PersonDAO.class);

            PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

            LOGGER.info("{}", personDao);
            LOGGER.info("{}", personDao.getJdbcConnection());

            LOGGER.info("{}", personDao2);
            LOGGER.info("{}", personDao2.getJdbcConnection());
        }
    }

}
