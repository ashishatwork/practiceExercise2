package com.stackroute.PE2;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest
{
    private PowerOfFour powerOfFour;

    @Test
    public void isPowerOfFour()
    {
     //act
     boolean result=PowerOfFour.powerOfFour(64);
     //assert
     assertEquals(true,result);
     System.out.println("isPowerOfFour :: Passed");
    }

    @Test
    public void zeroIsNotPowerOfFour()
    {
        //act
        boolean result=PowerOfFour.powerOfFour(0);
        //assert
        assertEquals(false,result);
        System.out.println("zeroIsNotPowerOfFour :: Passed");
    }

    @Test
    public void isNotPowerOfFour()
    {
        //act
        boolean result=PowerOfFour.powerOfFour(25);
        //assert
        assertEquals(false,result);
        System.out.println("isNotPowerOfFour :: Passed");
    }

    @Test
    public void negativeNumbers()
    {
        //act
        boolean result=PowerOfFour.powerOfFour(-16);
        //assert
        assertEquals(false,result);
        System.out.println("negativeNumbers :: Passed");
    }
}