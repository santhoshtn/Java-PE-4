package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordOccurrenceTest {
    private WordOccurrence object;
    @Before
    public void setUp() { object=new WordOccurrence(); }

    @After
    public void tearDown() { object=null; }

    @Test
    public  void findIndexSuccess(){
    String[] expected={"Found at : 0 - 1","Found at : 4 - 5"};
    assertArrayEquals(expected,object.findIndexes("Se","Sea Sells"));
    }
    @Test
    public void findIndexFailures(){
        String[] expected={"Found at : 0 - 1","Found at : 4 - 5"};
        assertNotEquals(expected,object.findIndexes("Se","Sea Sells"));
    }
    @Test
    public void nullCheck(){
        assertNull(object.findIndexes(null,null));
    }
}