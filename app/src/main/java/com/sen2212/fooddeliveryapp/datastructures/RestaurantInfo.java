package com.sen2212.fooddeliveryapp.datastructures;

public class RestaurantInfo {

    private String name;
    private LinkedListNode<FoodInfo> menu;

    public RestaurantInfo(String name, LinkedListNode<FoodInfo> menu){
        if(name == null) throw new NullPointerException("name is null!");
        if(menu == null) throw new NullPointerException("menu is null!");
        this.name = name;
        this.menu = menu;
    }

    public String getName(){
        return name;
    }

    public LinkedListNode<FoodInfo> getMenu(){
        return menu;
    }
}
