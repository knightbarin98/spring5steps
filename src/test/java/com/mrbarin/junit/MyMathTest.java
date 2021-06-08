package com.mrbarin.junit;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.AfterTestClass;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    //if you want to do something before each tests, you can do it in this method
    //eg: connection to database
    @BeforeEach
    public void before() {
        System.out.println("Before");
    }

    @AfterEach
    public void after() {
        System.out.println("After");
    }

    @BeforeTestClass
    public static void beforeClass() {
        System.out.println("Before class");
    }

    @AfterTestClass
    public static void afterClass() {
        System.out.println("After class");
    }

    //MyMath.sum
    // 1,2,3 => 6
    @Test
    public void sum_with3numbers() {
        System.out.println("Test 1");
        MyMath myMath = new MyMath();
        int result = myMath.sum(new int[]{1, 2, 3});

        //Check that result is 6
        //check result = 6
        assertEquals(6, result);
    }

    @Test
    public void sum_with1number() {
        System.out.println("Test 2");
        MyMath myMath = new MyMath();
        int result = myMath.sum(new int[]{3});

        //Check that result is 6
        //check result = 6
        assertEquals(3, result);
    }

}