package com.spring.basics.springbasics;

import com.spring.basics.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan("com.spring.basics.componentscan")
public class SpringComponentScanApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringComponentScanApplication.class);

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringComponentScanApplication.class);

        //ConfigurableApplicationContext run = SpringApplication.run(SpringComponentScanApplication.class, args);

        ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
        ComponentDAO componentDAO2 = applicationContext.getBean(ComponentDAO.class);


        LOGGER.info("{}", componentDAO);
    }

}
