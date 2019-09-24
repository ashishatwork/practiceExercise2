package com.stackroute.PE2;

public class PowerOfFour
{
    public static boolean powerOfFour(long num)
    {
        if(num==0 || num<0)
            return false;
        while(num>1)
        {
            if(num%4!=0)
                return false;
            num=num/4;
        }
        return true;


    }
}
