package com.sen2212.fooddeliveryapp.datastructures;

import android.graphics.Color;

public class FoodCategory {

    private String name;
    private int image;
    private int color;

    public FoodCategory(String name, int image, int color){
        if(name == null) throw new NullPointerException("name is null!");
        this.name = name;
        this.image = image;
        this.color = color;
    }

    public String getName(){
        return name;
    }

    public int getImage() {return image;}

    public int getColor(){return color;}
}
