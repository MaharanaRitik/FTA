package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class weightMaintain extends AppCompatActivity {

    ArrayList<dietModel> arrDiet = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_maintain);

        RecyclerView dietRecyclerViewList = findViewById(R.id.dietListMaintain);
        dietRecyclerViewList.setLayoutManager(new LinearLayoutManager(this));

        arrDiet.add(new dietModel(R.raw.breakfastdiet, "Morning:Breakfast", "Veg. Poha (1 cup) + Raita (1/2 cup)."));
        arrDiet.add(new dietModel(R.raw.midmealdiet, "Mid-Meal:Brunch", "Fruit Salad (1 cup) + Tender Coconut Water (1 glass)."));
        arrDiet.add(new dietModel(R.raw.homeclocktwelvediet, "Afternoon:Lunch", "1 cup white chana + palak paneer + 1 cup rice + 1 chapatti + salad."));
        arrDiet.add(new dietModel(R.raw.eveningdiet, "Evening:Snacks", "Tea/ Coffee (1 cup) + Mur-mure Chat (1 cup)."));
        arrDiet.add(new dietModel(R.raw.pancookingfooddiet, "Night:Dinner", "Chapati (2) + Mustard Greens (1 cup)."));

        recyclerDietAdapter adapter = new recyclerDietAdapter(this, arrDiet);
        dietRecyclerViewList.setAdapter(adapter);

    }
}