package com.katstout;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;



/**
 * Unit test for simple App.
 */
public class PersonTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldReturnHelloWorld()
    {
    Person marcus = new Person();
    assertEquals("Hello World", marcus.helloWorld()); 
    }
}
