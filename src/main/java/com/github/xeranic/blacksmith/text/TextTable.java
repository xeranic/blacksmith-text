package com.github.xeranic.blacksmith.text;

public interface TextTable extends TextBlock, HasTableAttributes, HasParagraphAttributes, HasCharacterAttributes {
    
    int getRowCount();
    
    int getRowIndex(TextTableRow row);
    
    TextTableRow getRow(int index);
    
    int getColumnCount();
    
    int getColumnIndex(TextTableColumn column);
    
    TextTableColumn getColumn(int index);
    
}