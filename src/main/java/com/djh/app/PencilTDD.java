package com.djh.app;

public class PencilTDD {
    

    public String write(Paper paper, String text) {
        
        paper.content = paper.content.concat(text);
        return paper.content;
        
    }

}
