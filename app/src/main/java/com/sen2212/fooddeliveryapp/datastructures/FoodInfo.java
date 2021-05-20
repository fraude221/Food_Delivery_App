package com.sen2212.fooddeliveryapp.datastructures;

public class FoodInfo {

    private String name;
    private TreeNode<FoodCategory> foodCategory;
    private double price;
    private String type;

    public FoodInfo(String name, TreeNode<FoodCategory> foodCategory, double price, String type){
        if(name == null) throw new NullPointerException("name is null!");
        if(foodCategory == null) throw new NullPointerException("foodCategory is null!");
        this.name = name;
        this.foodCategory = foodCategory;
        this.price = price;
        this.type = type;
    }


    public String getName(){
        return name;
    }

    public TreeNode<FoodCategory> getFoodCategory() { return foodCategory; }

    public double getPrice() { return price; }

    public String getPriceString(){
        return "₺" + String.format("%.2f", price);
    }

    public String getType(){return type;}

    public boolean hasCategory(String categoryName){
        if(categoryName == null) throw new NullPointerException("categoryName is null!");

        TreeNode<FoodCategory> current = foodCategory;

        if(current.isRoot()){
            if(current.getData().getName().equals(categoryName)){
                return true;
            }
            else{
                return false;
            }
        }
        else {
            while (!current.isRoot()){
                if(current.getData().getName().equals(categoryName)){
                    return true;
                }
                else{
                    current = current.getParent();
                }
            }

            if(current.getData().getName().equals(categoryName)){
                return true;
            }
            else {
                return false;
            }
        }
    }
}
