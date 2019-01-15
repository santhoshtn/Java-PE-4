package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ImplementRegexTest {
    ImplementRegex object;
    @Before
    public void setUp() throws Exception {
    object=new ImplementRegex();
    }

    @After
    public void tearDown() throws Exception {
    object=null;
    }
    @Test
    public void regexSuccess(){
        String expected="This is Harry";
        assertTrue(object.Regex(expected));
    }
    @Test
    public void regexFailure(){
        String expected="This is Henry";
        assertFalse(object.Regex(expected));
    }
    @Test
    public void nullCheck(){
        String expected=null;
        assertFalse(object.Regex(expected));
    }
}