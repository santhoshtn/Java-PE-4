package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReplaceCharacterTest {
    ReplaceCharacter object;
    @Before
    public void setUp() {
    object=new ReplaceCharacter();
    }
    @After
    public void tearDown() { object=null; }
    @Test
    public void replaceSuccessCheck(){
        assertEquals("faity fry",object.replace("daily dry"));
    }
    @Test
    public void replaceFailureCheck(){
        assertNotEquals("daily dry",object.replace("daily dry"));
    }
    @Test
    public void nullCheck(){
        assertNull(object.replace(null));
    }
}