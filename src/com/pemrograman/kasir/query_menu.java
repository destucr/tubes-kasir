package com.pemrograman.kasir;

public class query_menu extends menu_center{

    public String[] getMenu(int id){ //methode untuk mengambil data menu dalam bentuk string array
        return this.menu[id];
    }

    public int getIntPrice(String price){ //methode untuk mengubah type data harga dari string menjadi integer
        return Integer.parseInt(price);
    }

}
