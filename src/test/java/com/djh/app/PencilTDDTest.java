package com.djh.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PencilTDDTest {
    
    PencilTDD pencil = new PencilTDD();


    @Before
    public void init() {
        pencil = new PencilTDD();
    }
    
    
    @Test
    public void writeSingleLine() {
      
        Paper paper = new Paper();
        String writeText = "This is some text";
        pencil.write(paper, writeText);
        assertEquals(paper.content, writeText);
    }

}