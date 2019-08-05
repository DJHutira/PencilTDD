package com.djh.app;

public class PencilTDD {
    
    private int durability;
    
    PencilTDD(int durability) {
        this.durability = durability;
    }
    
    public void write(Paper paper, String text) {
        
        paper.content = paper.content.concat(text);
        decrement(text);
        
    }
    
    public int getDurability() {
        return this.durability;
    }
    
    private void decrement(String text) {
        durability -= text.length();
    }
    

}
