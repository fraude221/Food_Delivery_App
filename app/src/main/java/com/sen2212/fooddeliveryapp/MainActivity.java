package com.sen2212.fooddeliveryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private Button basketBtn;
    private LinearLayout dropDownMenu;
    private LinearLayout typeLayout;
    private LinearLayout foodLayout;
    private LinearLayout restaurantLayout;

    private String[] array = {"Pizza","Burger","Döner","Et","Makarna"};
    private String[] restaurants = {"kfc","pizza hot","ekrem coşkun","baruthane pilavcısı","pidem"};
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

        AddFoodList();
        AddRestaurants();

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
                    AddFoodList();
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

        // Call this first.
        Database.LoadData();

        // Filter restaurants by category
        LinkedListNode<RestaurantInfo> node = Database.FilterRestaurantsByCategory(Database.RESTAURANTS_ROOT, Database.CAT_BURGERS.getName());
    }

    private void AddFoodList(){
        dropDownMenu.setVisibility(View.VISIBLE);

        for (int i = 0;i<array.length;i++){
            final Button btn = new Button(MainActivity.this);
            btn.setBackgroundResource(R.drawable.free_btn);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, 100);
            layoutParams.setMargins(24, 15, 0, 15);
            btn.setLayoutParams(layoutParams);
            btn.setTextSize(10);
            btn.setText(array[i]);
            btn.setId(i);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    for (int i = 0;i<typeLayout.getChildCount();i++){
                        typeLayout.getChildAt(i).setBackgroundResource(R.drawable.free_btn);
                    }
                    btn.setBackgroundResource(R.drawable.pressed_btn);
                    //will be edited when tree is implemented
                    //***********************************
                    TextView text = new TextView(MainActivity.this);
                    text.setText(btn.getText());
                    text.setTextSize(9);
                    foodLayout.addView(text);
                    //***********************************
                }
            });
            typeLayout.addView(btn);
        }
        for (int i = 0;i<5;i++){
            LinearLayout foodBlock = new LinearLayout(MainActivity.this);
            Random rnd = new Random();
            int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            foodBlock.setBackgroundColor(color);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(300, 300);
            layoutParams.setMargins(24, 24, 0, 24);
            foodBlock.setLayoutParams(layoutParams);
            foodBlock.setOrientation(LinearLayout.VERTICAL);

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
            text.setText("Food Parent Name");
            text.setTextSize(9);
            foodBlock1.addView(text);

            ImageView img = new ImageView(MainActivity.this);
            img.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
            img.setImageResource(R.drawable.unnamed);
            foodBlock2.addView(img);

            TextView text2 = new TextView(MainActivity.this);
            text2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
            text2.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            text2.setGravity(Gravity.CENTER);
            text2.setText("Food Name");
            text2.setTextSize(9);
            foodBlock3.addView(text2);

            foodBlock.addView(foodBlock1);
            foodBlock.addView(foodBlock2);
            foodBlock.addView(foodBlock3);
            foodLayout.addView(foodBlock);
            foodLayout.setPadding(0,0,24,0);
        }
    }

    private void AddRestaurants(){
        for(int i = 0;i<restaurants.length;i++){
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
            text.setText("Restaurant Name");
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

            restaurantBlock.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this,RestaurantActivity.class);
                    startActivity(i);
                    overridePendingTransition(0, 0);
                }
            });

            restaurantLayout.addView(restaurantBlock);
        }
    }
}