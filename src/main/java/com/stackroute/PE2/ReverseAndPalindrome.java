package com.stackroute.PE2;

public class ReverseAndPalindrome
{
    public static String reverseAndPalindrome(long num)
    {
        long rev=0;

        rev=reverse(num);
        if(rev!=num)
        {
            return ("Not Palindrome");
        }
        else
        {
            return ("Palindrome");
        }
    }

    public static long reverse(long n)
    {
        long r=0;
        while(n>0)
        {
            r= r*10 +(n%10);
            n=n/10;
        }
        return r;
    }
}
