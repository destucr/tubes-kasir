package com.pemrograman.kasir;
import java.awt.event.KeyEvent;

public class useFilter {
    private validation valid;

    useFilter(validation v) {
        this.valid = v;
    }

    boolean filterDigit(KeyEvent n){ // untuk mengcek apakah input itu angka atau bukan
        return this.valid.validDigit(n);
    }

}
