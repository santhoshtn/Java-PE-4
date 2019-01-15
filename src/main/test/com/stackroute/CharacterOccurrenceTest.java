package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CharacterOccurrenceTest {
    CharacterOccurrence object;
    @Before
    public void setUp(){
        object=new CharacterOccurrence();
    }

    @After
    public void tearDown(){
    object=null;
    }
    @Test
    public void countTestSuccess(){
        Integer value=5;
        String expected="this is junit test method";
        assertEquals(value,object.count("t",expected));
    }
    @Test
    public void countTestFailure(){
        Integer value=6;
        String expected="this is junit test method";
        assertNotEquals(value,object.count("t",expected));
    }
    @Test
    public void nullCheck(){
        assertNull(object.count(null,null));
    }
}