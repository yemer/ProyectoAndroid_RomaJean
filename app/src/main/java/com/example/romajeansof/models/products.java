package com.example.romajeansof.models;

import java.util.ArrayList;

public class products {
    public String name;
    public  String description;


    public products(String _name ,String _desc) {
        this.name = _name;
        this.description = _desc;

    }
    public  String toString(){
        return  this.name;

    }



    public  static  ArrayList<products> getdata(){
        ArrayList<products> productos = new ArrayList<>();
        products.add(new products("galletitas","galletas deliciosas"));
        return products;
    }
}


