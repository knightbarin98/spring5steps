package com.mrbarin.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertTest {

    @Test
    public void test() {
        boolean condition = true;
        assertEquals(true,true);
        assertTrue(condition);
        assertFalse(condition);
    }

}