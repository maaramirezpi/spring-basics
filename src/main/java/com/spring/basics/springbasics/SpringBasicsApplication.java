package com.spring.basics.springbasics;

import com.spring.basics.springbasics.basic.BinarySearchImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
//@SpringBootApplication
public class SpringBasicsApplication {

    // what are the beans?

    public static void main(String[] args) {
        //BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicsApplication.class);

        //ConfigurableApplicationContext run = SpringApplication.run(SpringBasicsApplication.class, args);

        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

        BinarySearchImpl binarySearch2 = applicationContext.getBean(BinarySearchImpl.class);

        System.out.println(binarySearch);
        System.out.println(binarySearch2);

        int i = binarySearch.binarySearch(new int[]{12, 3, 4, 5}, 3);

        System.out.println(i);

        applicationContext.close();

    }

}
