package com.djh.app;

public class PencilTDD {
    

    public void write(Paper paper, String text) {
        
        paper.content = paper.content.concat(text);
        
    }

}
