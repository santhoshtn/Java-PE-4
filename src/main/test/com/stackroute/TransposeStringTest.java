package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class TransposeStringTest {
    private TransposeString object;
    @Before
    public void setUp()  {
    object =new TransposeString();
    }

    @After
    public void tearDown()  {
        object=null;
    }
    @Test
    public void transposeStringSuccess(){
    assertEquals("I ma hsohtnaS",object.transpose("I am Santhosh"));
    }
    @Test
    public void transposeStringFailure(){
        assertNotEquals("I am Santhosh",object.transpose("I am Santhosh"));
    }
    @Test
    public void nullCheck(){
        assertNull(object.transpose(null));
    }
}