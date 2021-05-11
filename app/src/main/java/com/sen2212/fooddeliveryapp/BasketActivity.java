package com.sen2212.fooddeliveryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BasketActivity extends AppCompatActivity {

    private Button restaurantBtn;
    private LinearLayout basketInfoLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);

        restaurantBtn = findViewById(R.id.basketRestaurantBtn);
        basketInfoLayout = findViewById(R.id.basketInfoLayout);

        restaurantBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                overridePendingTransition(0, 0);
            }
        });

        AddBasketInfo();
        AddFoodInfo();
    }

    private void AddBasketInfo(){
        LinearLayout restaurantBlock = new LinearLayout(this);
        restaurantBlock.setBackgroundColor(Color.WHITE);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 250);
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
        text.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        text.setText("Restaurant Name");
        text.setTextSize(24);
        restaurantBlock1.addView(text);

        ImageView img = new ImageView(this);
        img.setLayoutParams(new LinearLayout.LayoutParams(200, 200));
        img.setImageResource(R.drawable.unnamed);
        restaurantBlock2.addView(img);

        restaurantBlock.addView(restaurantBlock1);
        restaurantBlock.addView(restaurantBlock2);
        basketInfoLayout.addView(restaurantBlock);
    }
    private void AddFoodInfo(){

        LinearLayout line1 = new LinearLayout(this);
        line1.setBackgroundColor(Color.BLACK);
        line1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 5));
        basketInfoLayout.addView(line1);

        for(int i = 0;i<5;i++){
            LinearLayout foodBlock = new LinearLayout(this);
            foodBlock.setBackgroundColor(Color.WHITE);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            foodBlock.setLayoutParams(layoutParams);
            foodBlock.setOrientation(LinearLayout.HORIZONTAL);

            LinearLayout foods0 = new LinearLayout(this);
            foods0.setGravity(Gravity.CENTER);
            foods0.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT,3));

            LinearLayout foods1 = new LinearLayout(this);
            foods1.setOrientation(LinearLayout.VERTICAL);
            foods1.setPadding(24,24,0,24);
            foods1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT,1));

            LinearLayout foods2 = new LinearLayout(this);
            foods2.setGravity(Gravity.CENTER);
            foods2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT,3));

            LinearLayout foods3 = new LinearLayout(this);
            foods3.setGravity(Gravity.CENTER);
            foods3.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT,3));

            Button cancelBtn = new Button(this);
            cancelBtn.setLayoutParams(new LinearLayout.LayoutParams(80, 80));
            cancelBtn.setBackgroundResource(R.drawable.ic_baseline_cancel_24);
            foods0.addView(cancelBtn);

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
            foodPrice.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
            foodPrice.setText("\n17.00 TL");
            foodPrice.setTextSize(9);
            foodPrice.setTypeface(null,Typeface.BOLD);
            foods2.addView(foodPrice);

            TextView foodCount = new TextView(this);
            foodCount.setGravity(Gravity.CENTER);
            foodCount.setBackgroundResource(R.drawable.free_btn);
            foodCount.setLayoutParams(new LinearLayout.LayoutParams(80, 80));
            foodCount.setText("1");
            foodCount.setTextSize(12);
            foodCount.setTypeface(null,Typeface.BOLD);
            foods3.addView(foodCount);

            foodBlock.addView(foods0);
            foodBlock.addView(foods1);
            foodBlock.addView(foods2);
            foodBlock.addView(foods3);
            basketInfoLayout.addView(foodBlock);

            LinearLayout newLine = new LinearLayout(this);
            newLine.setBackgroundColor(Color.BLACK);
            newLine.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 5));
            basketInfoLayout.addView(newLine);
        }
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        overridePendingTransition(0, 0);
    }
}