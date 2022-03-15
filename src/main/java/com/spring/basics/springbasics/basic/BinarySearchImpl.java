package com.spring.basics.springbasics.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

    @Autowired
    @Qualifier("Bubble")
    private SortAlgorithm sortAlgorithm;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /*public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }*/

    /*public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }*/

    //sort the array
    //search
    //return result
    public int binarySearch(int[] numbers, int numberToSearch){

        //BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();

        int[] sortedNumbers = sortAlgorithm.sort(numbers);

        System.out.println(sortAlgorithm);
        return 3;
    }

    /*@PostConstruct
    public void PostConstruct(){
        logger.info("postconstruct");
    }

    @PreDestroy
    public void PreDestroy(){
        logger.info("predestroy");
    }*/


}
