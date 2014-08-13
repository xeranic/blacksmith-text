package com.github.xeranic.blacksmith.text;

public interface TextStory {
	
    int getLength();
    
    void insertText(int offset, CharSequence text);
    
    void appendText(CharSequence text);
    
    void removeText(int offset, int length);
    
    int getBlockCount();
    
    int getBlockIndex(TextBlock block);
    
    TextBlock getBlock(int index);
    
    int getBlockIndexByOffset(int offset);
    
    TextBlock getBlockByOffset(int offset);
    
}