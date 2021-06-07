package com.mrbarin.springcourse.basics.springin5steps;

import com.mrbarin.springcourse.basics.springin5steps.cdi.SomeCdiBussiness;
import com.mrbarin.springcourse.basics.springin5steps.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan("com.mrbarin.springcourse.basics.springin5steps")
public class SpringIn5StepsApplicationContextXml {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsApplicationContextXml.class);

    public static void main(String[] args) {

        //With the instance inside the try we assure that in case of error the application will close itself
        try (ClassPathXmlApplicationContext applicationContext
                     = new ClassPathXmlApplicationContext("applicationContext.xml")) {

            LOGGER.info("Beans-loaded -> {}",(Object) applicationContext.getBeanDefinitionNames());

            XmlPersonDAO personDAO = applicationContext.getBean(XmlPersonDAO.class);

            LOGGER.info("{} xmljdb-{}", personDAO, personDAO.getXmlJdbcConnection());

        }
    }


}
