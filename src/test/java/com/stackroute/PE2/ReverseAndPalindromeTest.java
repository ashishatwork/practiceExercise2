package com.stackroute.PE2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseAndPalindromeTest
{

    private ReverseAndPalindrome reverseAndPalindrome;

    @Test
    public void isPalindrome()
    {
        //act
        String result=ReverseAndPalindrome.reverseAndPalindrome(123454321);
        //assert
        assertEquals("Palindrome", result);
        System.out.println("isPalindrome :: Passed");

    }

    @Test
    public void isNotPalindrome()
    {
        //act
        String result=ReverseAndPalindrome.reverseAndPalindrome(992837465);
        //assert
        assertEquals("Not Palindrome", result);
        System.out.println("isNotPalindrome :: Passed");

    }
}