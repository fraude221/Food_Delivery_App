package com.sen2212.fooddeliveryapp.datastructures;

public class FoodCategory {

    private String name;
    private int image;

    public FoodCategory(String name, int image){
        if(name == null) throw new NullPointerException("name is null!");
        this.name = name;
        this.image = image;
    }

    public String getName(){
        return name;
    }

    public int getImage() {return image;}
}
