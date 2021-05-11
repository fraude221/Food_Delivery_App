package com.sen2212.fooddeliveryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RestaurantActivity extends AppCompatActivity {

    private LinearLayout restaurantInfoLayout;
    private ImageView backBtn;
    private Button restaurantBasketBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        restaurantInfoLayout = findViewById(R.id.restaurantInfoLayout);
        backBtn = findViewById(R.id.backBtn);
        restaurantBasketBtn = findViewById(R.id.restaurantBasketBtn);

        AddRestaurantInfo();
        AddFoodInfo();

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                overridePendingTransition(0, 0);
            }
        });
        restaurantBasketBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent i = new Intent(RestaurantActivity.this,BasketActivity.class);
                startActivity(i);
                overridePendingTransition(0, 0);
            }
        });
    }

    private void AddRestaurantInfo(){
        LinearLayout restaurantBlock = new LinearLayout(this);
        restaurantBlock.setBackgroundColor(Color.WHITE);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 400);
        layoutParams.setMargins(0, 24, 0, 24);
        restaurantBlock.setLayoutParams(layoutParams);
        restaurantBlock.setPadding(24,0,0,0);
        restaurantBlock.setOrientation(LinearLayout.HORIZONTAL);

        LinearLayout restaurantBlock1 = new LinearLayout(this);
        restaurantBlock1.setOrientation(LinearLayout.VERTICAL);
        restaurantBlock1.setPadding(0,50,0,0);
        restaurantBlock1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT,1));

        LinearLayout restaurantBlock2 = new LinearLayout(this);
        restaurantBlock2.setGravity(Gravity.CENTER);
        restaurantBlock2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT,3));

        TextView text = new TextView(this);
        text.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        text.setText("Restaurant Name");
        text.setTextSize(24);
        restaurantBlock1.addView(text);

        TextView text2 = new TextView(this);
        text2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        text2.setText("Cuisines: type1, type2, type3"+"\n"+"Adress: xxxxxxxxxxxx"+"\n"+"Tel no: 05** *** ** **");
        text2.setTextSize(12);
        restaurantBlock1.addView(text2);

        ImageView img = new ImageView(this);
        img.setLayoutParams(new LinearLayout.LayoutParams(250, 250));
        img.setImageResource(R.drawable.unnamed);
        restaurantBlock2.addView(img);

        restaurantBlock.addView(restaurantBlock1);
        restaurantBlock.addView(restaurantBlock2);
        restaurantInfoLayout.addView(restaurantBlock);
    }
    private void AddFoodInfo(){
        //If exist

        TextView text = new TextView(this);
        text.setTypeface(null,Typeface.BOLD);
        text.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        text.setText("Foods");
        text.setTextSize(15);
        text.setPadding(24,0,0,0);
        restaurantInfoLayout.addView(text);

        LinearLayout line1 = new LinearLayout(this);
        line1.setBackgroundColor(Color.BLACK);
        line1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 5));
        restaurantInfoLayout.addView(line1);

        for(int i = 0;i<5;i++){
            LinearLayout foodBlock = new LinearLayout(this);
            foodBlock.setBackgroundColor(Color.WHITE);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            foodBlock.setLayoutParams(layoutParams);
            foodBlock.setOrientation(LinearLayout.HORIZONTAL);

            LinearLayout foods1 = new LinearLayout(this);
            foods1.setOrientation(LinearLayout.VERTICAL);
            foods1.setPadding(24,24,0,24);
            foods1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT,1));

            LinearLayout foods2 = new LinearLayout(this);
            foods2.setGravity(Gravity.CENTER);
            foods2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT,4));

            TextView foodNameText = new TextView(this);
            foodNameText.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            foodNameText.setText("Pizza");
            foodNameText.setTextSize(12);
            foods1.addView(foodNameText);

            //If exist
            TextView foodExplanation = new TextView(this);
            foodExplanation.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            foodExplanation.setText("Domates, peynir, sucuk");
            foodExplanation.setTextSize(9);
            foods1.addView(foodExplanation);

            TextView foodPrice = new TextView(this);
            foodPrice.setTextColor(Color.GREEN);
            foodPrice.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            foodPrice.setText("\n17.00 TL");
            foodPrice.setTextSize(9);
            foodPrice.setTypeface(null,Typeface.BOLD);
            foods1.addView(foodPrice);

            Button buyButton = new Button(this);
            buyButton.setLayoutParams(new LinearLayout.LayoutParams(120, 120));
            Drawable normal = getResources().getDrawable(R.drawable.ic_baseline_add_circle_24_normal);
            Drawable pressed = getResources().getDrawable(R.drawable.ic_baseline_add_circle_24_pressed);

            StateListDrawable listDrawable = new StateListDrawable();
            listDrawable.addState(new int[] {android.R.attr.state_pressed}, pressed);
            listDrawable.addState(new int[] {}, normal);
            buyButton.setBackground(listDrawable);
            foods2.addView(buyButton);

            foodBlock.addView(foods1);
            foodBlock.addView(foods2);
            restaurantInfoLayout.addView(foodBlock);

            LinearLayout newLine = new LinearLayout(this);
            newLine.setBackgroundColor(Color.BLACK);
            newLine.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 5));
            restaurantInfoLayout.addView(newLine);
        }

        TextView text2 = new TextView(this);
        text2.setTypeface(null,Typeface.BOLD);
        text2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        text2.setText("Drinks");
        text2.setTextSize(15);
        restaurantInfoLayout.addView(text2);

        LinearLayout line2 = new LinearLayout(this);
        line2.setBackgroundColor(Color.BLACK);
        line2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 5));
        restaurantInfoLayout.addView(line2);

        for(int i = 0;i<5;i++){
            LinearLayout foodBlock = new LinearLayout(this);
            foodBlock.setBackgroundColor(Color.WHITE);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            foodBlock.setLayoutParams(layoutParams);
            foodBlock.setOrientation(LinearLayout.HORIZONTAL);

            LinearLayout foods1 = new LinearLayout(this);
            foods1.setOrientation(LinearLayout.VERTICAL);
            foods1.setPadding(24,24,0,24);
            foods1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT,1));

            LinearLayout foods2 = new LinearLayout(this);
            foods2.setGravity(Gravity.CENTER);
            foods2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT,4));

            TextView foodNameText = new TextView(this);
            foodNameText.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            foodNameText.setText("Pizza");
            foodNameText.setTextSize(12);
            foods1.addView(foodNameText);

            //If exist
            TextView foodExplanation = new TextView(this);
            foodExplanation.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            foodExplanation.setText("Domates, peynir, sucuk");
            foodExplanation.setTextSize(9);
            foods1.addView(foodExplanation);

            TextView foodPrice = new TextView(this);
            foodPrice.setTextColor(Color.GREEN);
            foodPrice.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            foodPrice.setText("\n17.00 TL");
            foodPrice.setTextSize(9);
            foodPrice.setTypeface(null,Typeface.BOLD);
            foods1.addView(foodPrice);

            Button buyButton = new Button(this);
            buyButton.setLayoutParams(new LinearLayout.LayoutParams(120, 120));
            Drawable normal = getResources().getDrawable(R.drawable.ic_baseline_add_circle_24_normal);
            Drawable pressed = getResources().getDrawable(R.drawable.ic_baseline_add_circle_24_pressed);

            StateListDrawable listDrawable = new StateListDrawable();
            listDrawable.addState(new int[] {android.R.attr.state_pressed}, pressed);
            listDrawable.addState(new int[] {}, normal);
            buyButton.setBackground(listDrawable);
            foods2.addView(buyButton);

            foodBlock.addView(foods1);
            foodBlock.addView(foods2);
            restaurantInfoLayout.addView(foodBlock);

            LinearLayout newLine = new LinearLayout(this);
            newLine.setBackgroundColor(Color.BLACK);
            newLine.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 5));
            restaurantInfoLayout.addView(newLine);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        overridePendingTransition(0, 0);
    }
}