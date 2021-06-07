package com.mrbarin.springcourse.basics.springin5steps;

import com.mrbarin.springcourse.basics.springin5steps.properties.SomeExternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
//to load properties file
@PropertySource("classpath: app.properties")
public class SpringIn5StepsApplicationProperties {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsApplicationProperties.class);

    public static void main(String[] args) {

        //With the instance inside the try we assure that in case of error the application will close itself
        try (AnnotationConfigApplicationContext applicationContext
                     = new AnnotationConfigApplicationContext(SpringIn5StepsApplicationProperties.class)) {

            SomeExternalService someservice = applicationContext.getBean(SomeExternalService.class);

            LOGGER.info("{}", someservice);

        }
    }
}
