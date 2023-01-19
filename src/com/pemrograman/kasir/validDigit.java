package com.pemrograman.kasir;

import java.awt.event.KeyEvent;

public class validDigit implements validation{
    @Override
    public boolean validDigit(KeyEvent b){ //methode untuk mengcek apakah input adalah angka atau tidak
        boolean status = true; // berarti benar digit
        if(b.getKeyChar() == b.VK_BACK_SPACE){
        }else if(!Character.isDigit(b.getKeyChar()) == true){
            status = false; //bukan digit
        }
        return status;
    }
}
