package com.stackroute.PE2;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    private EvenNumTest evenNumTest;

    @Test
    public void isEvenNum() {
        //act
        boolean result = EvenNumTest.isEven(92);
        //assert
        assertEquals(true, result);
        System.out.println("isEvenNum:: Passed");
    }

    @Test
    public void isZeroEven() {
        //act
        boolean result = EvenNumTest.isEven(0);
        //assert
        assertEquals(true, result);
        System.out.println("isZeroEven:: Passed");
    }

    @Test
    public void forNegativeNum() {
        //act
        boolean result = EvenNumTest.isEven(-24);
        //assert
        assertEquals(true, result);
        System.out.println("forNegativeNum:: Passed");
    }
}