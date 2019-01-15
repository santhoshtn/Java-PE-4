package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class SortParaWordsTest {
    private SortParaWords object;
    @Before
    public void setUp() {
        object=new SortParaWords();
    }
    @After
    public void tearDown(){
     object=null;
    }
    @Test
    public void sortSuccess(){
        String[] expected={"hello","world"};
        assertArrayEquals(expected,object.sort("hello world"));
    }
    @Test
    public void sortFailure(){
        String[] expected={"world","hello"};
        assertNotEquals(expected,object.sort("hello world"));
    }
    @Test
    public void nullCheck(){
     assertNull(object.sort(null));
    }
}

