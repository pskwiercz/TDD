package com.pskwiercz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pskwierc on 20/12/2016.
 */
public class DollarTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.getAmount());
    }

}