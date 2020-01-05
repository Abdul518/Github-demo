package com.qadeer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Junitassertexample
{
    @Test


        public void junitassertexample ()
         {
            Junitadd nameJunit = new Junitadd();
            int result = nameJunit.add(100,200);
            assertEquals(300,result);


         }

}
