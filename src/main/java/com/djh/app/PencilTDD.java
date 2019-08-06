package com.djh.app;

public class PencilTDD {
    
    private int durability;
    
    PencilTDD(int durability) {
        this.durability = durability;
    }
    
    public void write(Paper paper, String text) {
        
        paper.content = paper.content.concat(text);
        decrementDurability(text);
        
    }
    
    public int getDurability() {
        return this.durability;
    }
    
    private void decrementDurability(String text) {
        int textWeight=0;
        for( int i=0; i<text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                textWeight += 2;
            } else {
                textWeight += 1;
            }
        }
        durability -= textWeight;
    }
    

}
