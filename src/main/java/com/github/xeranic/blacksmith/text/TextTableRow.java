package com.github.xeranic.blacksmith.text;

public interface TextTableRow {
 
    int getCellCount();
    
    int getCellIndex(TextTableCell cell);
    
    TextTableCell getCell(int index);
    
}