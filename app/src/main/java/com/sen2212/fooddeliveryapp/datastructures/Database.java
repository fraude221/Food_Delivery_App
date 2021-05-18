package com.sen2212.fooddeliveryapp.datastructures;

import com.sen2212.fooddeliveryapp.R;

public class Database {

    // Categories
    public static FoodCategory CAT_ROOT = new FoodCategory("Categories", R.drawable.ic_launcher_background); // Categories
    public static FoodCategory CAT_KEBAPS = new FoodCategory("Kebaps", R.drawable.ic_launcher_background); // Categories > Kebaps
    public static FoodCategory CAT_KEBAPS_ADANA = new FoodCategory("Adana Kebap", R.drawable.ic_launcher_background); // Categories > Kebaps > Adana Kebap
    public static FoodCategory CAT_KEBAPS_URFA = new FoodCategory("Urfa Kebap", R.drawable.ic_launcher_background); // Categories > Kebaps > Urfa Kebap
    public static FoodCategory CAT_BURGERS = new FoodCategory("Hamburgers", R.drawable.ic_launcher_background); // Categories > Hamburgers
    public static FoodCategory CAT_BURGERS_MUSHROOM = new FoodCategory("Mushroom Burger", R.drawable.ic_launcher_background); // Categories > Hamburgers > Mushroom Burger
    public static FoodCategory CAT_BURGERS_VEGAN = new FoodCategory("Vegan Burger", R.drawable.ic_launcher_background); // Categories > Hamburgers > Vegan Burger
    public static FoodCategory CAT_BURGERS_KIDS = new FoodCategory("Kids Burger", R.drawable.ic_launcher_background); // Categories > Hamburgers > Kids Burger

    public static TreeNode<FoodCategory> NCAT_ROOT;
    public static TreeNode<FoodCategory> NCAT_KEBAPS;
    public static TreeNode<FoodCategory> NCAT_KEBAPS_ADANA;
    public static TreeNode<FoodCategory> NCAT_KEBAPS_URFA;
    public static TreeNode<FoodCategory> NCAT_BURGERS;
    public static TreeNode<FoodCategory> NCAT_BURGERS_MUSHROOM;
    public static TreeNode<FoodCategory> NCAT_BURGERS_VEGAN;
    public static TreeNode<FoodCategory> NCAT_BURGERS_KIDS;

    // Foods
    public static FoodInfo FOOD_BIBER_01 = new FoodInfo("Super Cool Mushroom Burger", NCAT_BURGERS_MUSHROOM, 35.90, R.drawable.ic_launcher_foreground);
    public static FoodInfo FOOD_BIBER_02 = new FoodInfo("Super Cool Vegan Burger", NCAT_BURGERS_VEGAN, 39.90, R.drawable.ic_launcher_foreground);

    // Restaurants
    public static LinkedListNode<RestaurantInfo> RESTAURANTS_ROOT;

    public static void LoadData(){
        LoadFoodCategories();
        LoadRestaurants();
    }

    private static void LoadFoodCategories(){
        NCAT_ROOT = TreeNode.CreateTree(CAT_ROOT);
        NCAT_KEBAPS = NCAT_ROOT.addChildNode(CAT_KEBAPS);
        NCAT_KEBAPS_ADANA = NCAT_KEBAPS.addChildNode(CAT_KEBAPS_ADANA);
        NCAT_KEBAPS_URFA = NCAT_KEBAPS.addChildNode(CAT_KEBAPS_URFA);
        NCAT_BURGERS = NCAT_ROOT.addChildNode(CAT_BURGERS);
        NCAT_BURGERS_MUSHROOM = NCAT_BURGERS.addChildNode(CAT_BURGERS_MUSHROOM);
        NCAT_BURGERS_VEGAN= NCAT_BURGERS.addChildNode(CAT_BURGERS_VEGAN);
        NCAT_BURGERS_KIDS = NCAT_BURGERS.addChildNode(CAT_BURGERS_KIDS);
    }

    private static void LoadRestaurants(){
        // Biber Burger
        LinkedListNode<FoodInfo> biberBurgerMenu = LinkedListNode.CreateList(FOOD_BIBER_01);
        biberBurgerMenu.addNextNode(FOOD_BIBER_02);
        RestaurantInfo biberBurger = new RestaurantInfo("Biber Burger", biberBurgerMenu);

        // Biber Burger 2
        LinkedListNode<FoodInfo> biberBurgerMenu2 = LinkedListNode.CreateList(FOOD_BIBER_01);
        biberBurgerMenu2.addNextNode(FOOD_BIBER_02);
        RestaurantInfo biberBurger2 = new RestaurantInfo("Biber Burger2", biberBurgerMenu);

        // Create Linked List
        LinkedListNode<RestaurantInfo> restaurants = LinkedListNode.CreateList(biberBurger);
        restaurants.addNextNode(biberBurger2);

        // data
        RESTAURANTS_ROOT = restaurants;
    }

    public static LinkedListNode<RestaurantInfo> FilterRestaurantsByCategory(LinkedListNode<RestaurantInfo> node, String categoryName){
        if(node == null) throw new NullPointerException("RestaurantInfo node is null!");

        LinkedListNode<RestaurantInfo> filtered = null;
        LinkedListNode<RestaurantInfo> currentRest = node;
        while (true){

            LinkedListNode<FoodInfo> currentFood = currentRest.getData().getMenu();
            while (true){
                if(currentFood.getData().hasCategory(categoryName)){
                    if(filtered == null){
                        filtered = LinkedListNode.CreateList(currentRest.getData());
                        break;
                    }
                    else {
                        filtered.addNextNode(currentRest.getData());
                        break;
                    }
                }

                if(currentFood.isTail()){
                    break;
                }
                else {
                    currentFood = currentFood.getNext();
                }
            }

            if(currentRest.isTail()){
                return filtered;
            }
            else{
                currentRest = currentRest.getNext();
            }
        }
    }
}
