package com.sen2212.fooddeliveryapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.sen2212.fooddeliveryapp.datastructures.BasketList;
import com.sen2212.fooddeliveryapp.datastructures.Database;
import com.sen2212.fooddeliveryapp.datastructures.FoodCategory;
import com.sen2212.fooddeliveryapp.datastructures.LinkedListNode;
import com.sen2212.fooddeliveryapp.datastructures.RestaurantInfo;
import com.sen2212.fooddeliveryapp.datastructures.TreeNode;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private Button basketBtn;

    private TextView notificationText;

    private LinearLayout dropDownMenu;
    private LinearLayout typeLayout;
    private LinearLayout foodLayout;
    private LinearLayout restaurantLayout;

    private LinkedListNode<RestaurantInfo> rootRestaurant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        basketBtn = findViewById(R.id.mainBasketBtn);
        dropDownMenu = findViewById(R.id.dropDown);
        typeLayout = findViewById(R.id.typeLayout);
        foodLayout = findViewById(R.id.foodLayout);
        restaurantLayout = findViewById(R.id.restaurantLayout);
        notificationText = findViewById(R.id.notificationText);
        notificationText.setVisibility(View.GONE);

        basketBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,BasketActivity.class);
                startActivity(i);
                overridePendingTransition(0, 0);
            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dropDownMenu.getVisibility() == View.GONE){
                    AddFoodCategories();
                    addLeafNodes(Database.NCAT_ROOT);
                }else{
                    dropDownMenu.setVisibility(View.GONE);

                    typeLayout.removeAllViews();
                    foodLayout.removeAllViews();
                }
            }
        });

        // ---------------------------------------------
        //                   EXAMPLE
        // ----------------------------------------------

        if(BasketList.unseenNotifications>0){
            notificationText.setVisibility(View.VISIBLE);
            notificationText.setText(""+BasketList.unseenNotifications);
        }

        // Call this first.
        Database.LoadData();

        // Filter restaurants by category
        rootRestaurant = Database.RESTAURANTS_ROOT;

        AddFoodCategories();
        addLeafNodes(Database.NCAT_ROOT);
        AddRestaurants();
    }

    private void AddFoodCategories(){
        dropDownMenu.setVisibility(View.VISIBLE);

        typeLayout.removeAllViews();

        final Button allBtn = new Button(MainActivity.this);
        allBtn.setBackgroundResource(R.drawable.free_btn);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, 100);
        layoutParams.setMargins(24, 10, 0, 10);
        allBtn.setPadding(0,5,0,5);
        allBtn.setLayoutParams(layoutParams);
        allBtn.setTextSize(10);
        allBtn.setText("All");
        allBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0;i<typeLayout.getChildCount();i++){
                    typeLayout.getChildAt(i).setBackgroundResource(R.drawable.free_btn);
                }
                allBtn.setBackgroundResource(R.drawable.pressed_btn);

                foodLayout.removeAllViews();
                addLeafNodes(Database.NCAT_ROOT);
            }
        });
        typeLayout.addView(allBtn);
        for (int i = 0;i<Database.NCAT_ROOT.getChildCount();i++){
            final Button categoryBtn = new Button(MainActivity.this);
            categoryBtn.setBackgroundResource(R.drawable.free_btn);
            categoryBtn.setLayoutParams(layoutParams);
            categoryBtn.setPadding(0,5,0,5);
            categoryBtn.setTextSize(10);
            categoryBtn.setText(Database.NCAT_ROOT.getChildNode(i).getData().getName());
            final int childIndex = i;
            categoryBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    for (int i = 0;i<typeLayout.getChildCount();i++){
                        typeLayout.getChildAt(i).setBackgroundResource(R.drawable.free_btn);
                    }
                    categoryBtn.setBackgroundResource(R.drawable.pressed_btn);

                    foodLayout.removeAllViews();
                    addLeafNodes(Database.NCAT_ROOT.getChildNode(childIndex));
                }
            });
            typeLayout.addView(categoryBtn);
        }
    }

    private void AddRestaurants(){
        LinkedListNode<RestaurantInfo> currentNode;
        currentNode = rootRestaurant;
        while(currentNode != null){
            LinearLayout restaurantBlock = new LinearLayout(MainActivity.this);
            restaurantBlock.setBackgroundColor(Color.WHITE);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 400);
            layoutParams.setMargins(0, 24, 0, 24);
            restaurantBlock.setLayoutParams(layoutParams);
            restaurantBlock.setPadding(24,0,0,0);
            restaurantBlock.setOrientation(LinearLayout.HORIZONTAL);

            LinearLayout restaurantBlock1 = new LinearLayout(MainActivity.this);
            restaurantBlock1.setOrientation(LinearLayout.VERTICAL);
            restaurantBlock1.setPadding(0,50,0,0);
            restaurantBlock1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT,1));

            LinearLayout restaurantBlock2 = new LinearLayout(MainActivity.this);
            restaurantBlock2.setGravity(Gravity.CENTER);
            restaurantBlock2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT,3));

            TextView text = new TextView(MainActivity.this);
            text.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            text.setText(currentNode.getData().getName());
            text.setTextSize(24);
            restaurantBlock1.addView(text);

            TextView text2 = new TextView(MainActivity.this);
            text2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
            text2.setText("Cuisines: type1, type2, type3"+"\n"+"Adress: xxxxxxxxxxxx"+"\n"+"Tel no: 05** *** ** **");
            text2.setTextSize(12);
            restaurantBlock1.addView(text2);

            ImageView img = new ImageView(MainActivity.this);
            img.setLayoutParams(new LinearLayout.LayoutParams(250, 250));
            img.setImageResource(R.drawable.unnamed);
            restaurantBlock2.addView(img);

            restaurantBlock.addView(restaurantBlock1);
            restaurantBlock.addView(restaurantBlock2);

            final String sendedData = currentNode.getData().getName();

            restaurantBlock.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this,RestaurantActivity.class);
                    i.putExtra("key",sendedData);
                    startActivity(i);
                    overridePendingTransition(0, 0);
                }
            });

            restaurantLayout.addView(restaurantBlock);

            currentNode = currentNode.getNext();
        }
    }

    private void addLeafNodes(TreeNode<FoodCategory> root)
    {
        // If node is null, return
        if (root == null)
            return;

        // If node is leaf node, print its data
        if (root.getChildCount()==0)
        {
            addFoodBlock(root,root.getData().getName(),root.getParent().getData().getName(),root.getData().getImage(),root.getData().getColor());
            return;
        }

        // If left child exists, check for leaf
        // recursively
        if (root.getChildCount()>0){
            for (int i = 0;i<root.getChildCount();i++){
                addLeafNodes(root.getChildNode(i));
            }
        }
    }

    private void addFoodBlock(final TreeNode<FoodCategory> newRoot, String foodName, String foodParentName,int image,int color){
        final LinearLayout foodBlock = new LinearLayout(MainActivity.this);
        foodBlock.setBackgroundColor(color);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(300, 300);
        layoutParams.setMargins(24, 24, 0, 24);
        foodBlock.setLayoutParams(layoutParams);
        foodBlock.setOrientation(LinearLayout.VERTICAL);
        foodBlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restaurantLayout.removeAllViews();
                rootRestaurant = Database.FilterRestaurantsByCategory(Database.RESTAURANTS_ROOT, newRoot.getData().getName());
                AddRestaurants();
            }
        });

        LinearLayout foodBlock1 = new LinearLayout(MainActivity.this);
        foodBlock1.setLayoutParams(new LinearLayout.LayoutParams(300, 50,2));
        LinearLayout foodBlock2 = new LinearLayout(MainActivity.this);
        foodBlock2.setLayoutParams(new LinearLayout.LayoutParams(300, 200,1));
        LinearLayout foodBlock3 = new LinearLayout(MainActivity.this);
        foodBlock3.setLayoutParams(new LinearLayout.LayoutParams(300, 50,2));

        TextView text = new TextView(MainActivity.this);
        text.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        text.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        text.setGravity(Gravity.CENTER);
        if(foodParentName!=null)
            text.setText(foodParentName);
        text.setTextSize(9);
        foodBlock1.addView(text);

        ImageView img = new ImageView(MainActivity.this);
        img.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        img.setImageResource(image);
        foodBlock2.addView(img);

        TextView text2 = new TextView(MainActivity.this);
        text2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        text2.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        text2.setGravity(Gravity.CENTER);
        text2.setText(foodName);
        text2.setTextSize(9);
        foodBlock3.addView(text2);

        foodBlock.addView(foodBlock1);
        foodBlock.addView(foodBlock2);
        foodBlock.addView(foodBlock3);
        foodLayout.addView(foodBlock);
        foodLayout.setPadding(0,0,24,0);
    }

    @Override
    protected void onResume() {
        super.onResume();

        if(BasketList.unseenNotifications>0){
            notificationText.setVisibility(View.VISIBLE);
            notificationText.setText(""+BasketList.unseenNotifications);
        }else {
            notificationText.setVisibility(View.GONE);
        }
    }
}