package com.djh.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PencilTDDTest {
    
    PencilTDD pencil; 
    Paper paper;


    @Before
    public void init() {
        pencil = new PencilTDD(1000);
        paper = new Paper();
    }
    
    
    @Test
    public void writeSingleLine() {
      
        String writeText = "This is some text";
        pencil.write(paper, writeText);
        assertEquals(paper.content, writeText);
    }
    
    @Test
    public void writeMultipleLines() {

        String writeText = "This is some text";
        String writeMoreText = "This is some more text";
        pencil.write(paper, writeText);
        pencil.write(paper, writeMoreText);
        assertEquals(paper.content, writeText.concat(writeMoreText));
    }
    
    @Test
    public void durabilityDecrement() {
        pencil.write(paper, "abc");
        assertEquals(997, pencil.getDurability());
    }
   
    @Test
    public void durabilityDecrementUpperLowerCase() {
        pencil.write(paper, "Abc");
        assertEquals(996, pencil.getDurability());
    }

}