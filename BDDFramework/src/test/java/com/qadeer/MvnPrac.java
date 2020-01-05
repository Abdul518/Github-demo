package com.qadeer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MvnPrac {
    int a =20; int b = 30;
    int c ;
@Test
  public void sum ()
{
    // add two integers

    System.out.println ("Addition of 2 numbers is  " +(c=(a+b)));
}
@Before
    public void subs ()
    {
        // Substraction of 2 integers

        System.out.println("Substraction of 2 numbers is " +(c =(b-a)));
    }

@After
    public void div ()
    {
        // Division of 2 integers

        System.out.println("Division of 2 numbers is " +(c =(b/2)));
    }

    @Test
    public void mul ()
    {
        // multiplication of 2 integers

        System.out.println("The multiplication of 2 number is  "+(c =(a*b)));
    }


}
