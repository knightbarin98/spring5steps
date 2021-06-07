package com.mrbarin.springcourse.basics.springin5steps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.mrbarin.springcourse.basics.springin5steps.cdi.SomeCdiBussiness;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.mrbarin.springcourse.basics.springin5steps")
public class SpringIn5StepsApplicationCdi {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsApplicationCdi.class);

    public static void main(String[] args) {

        //With the instance inside the try we assure that in case of error the application will close itself
        try (AnnotationConfigApplicationContext applicationContext
                     = new AnnotationConfigApplicationContext(SpringIn5StepsApplicationCdi.class)) {

            SomeCdiBussiness bussiness = applicationContext.getBean(SomeCdiBussiness.class);

            LOGGER.info("{} dao-{}", bussiness, bussiness.getSomeCdiDao());

        }
    }

}
