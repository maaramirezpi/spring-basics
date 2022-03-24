package com.spring.basics.springbasics;

import com.spring.basics.springbasics.xml.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlContextApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringXmlContextApplication.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        LOGGER.info("Beans loaded: {}", (Object) classPathXmlApplicationContext.getBeanDefinitionNames());
        XMLPersonDAO xmlPersonDAO = classPathXmlApplicationContext.getBean(XMLPersonDAO.class);

        LOGGER.info("{}", xmlPersonDAO);
        LOGGER.info("{}", xmlPersonDAO.getXMLJdbcConnection());

    }

}
