package com.github.xeranic.blacksmith.text;

public interface TextTableColumn {
    
    int getCellCount();
    
    int getCellIndex(TextTableCell cell);
    
    TextTableCell getCell(int index);
    
}