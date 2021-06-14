package com.mrbarin.springcourse.basics.springin5steps.basic;

import com.mrbarin.springcourse.basics.springin5steps.Springin5stepsApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;


//Need to load the context
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = Springin5stepsApplication.class)
public class BinarySearchTest {

    //get this bean from the context
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario() {
        //call method on binarySearch
        int actualResult = binarySearch.binarySearch(new int[0],5);
        //check if value is correct
        assertEquals(4,actualResult);
    }
}
