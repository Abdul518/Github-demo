package com.qadeer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junitpractice
{
        int a =20;
        int b =30;
        int c;
        int d;
@Test
    public void sum ()
    {
    //addition of 2 integers
    System.out.println("The addition of 2 numbers is  "+(c=(a+b)));
    }

@Before
    public void sub()
    {
        //Subtraction  of 2 integers
        System.out.println("The Subtraction of 2 numbers is  "+(c=(b-a)));
    }


@After
    public void mul ()
    {
        //multiplication  of 2 integers
        System.out.println("The multiplication of 2 numbers is  "+(c=(a*b)));
    }

@After
    public void div()
    {
        //division of 2 integers
        System.out.println("The division of 2 numbers is  "+(c=(a+b)/2));
    }


}
