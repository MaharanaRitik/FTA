package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class weightLoss extends AppCompatActivity {

    ArrayList<dietModel> arrDiet = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_loss);

        RecyclerView dietRecyclerViewList = findViewById(R.id.dietListLoss);
        dietRecyclerViewList.setLayoutManager(new LinearLayoutManager(this));

        arrDiet.add(new dietModel(R.raw.breakfastdiet, "Morning:Breakfast", "6:30 AM\tCucumber Detox Water (1 glass)\n" +
                "8:00 AM\tOats Porridge in Skimmed Milk (1 bowl)"));
        arrDiet.add(new dietModel(R.raw.midmealdiet, "Mid-Meal:Brunch", "12:00 PM\tSkimmed Milk Paneer (100 grams)"));
        arrDiet.add(new dietModel(R.raw.homeclocktwelvediet, "Afternoon:Lunch", "2:00 PM\tMixed Vegetable Salad (1 katori)\n" +
                "2:10 PM\tDal(1 katori)Gajar Matar Sabzi (1 katori)"));
        arrDiet.add(new dietModel(R.raw.eveningdiet, "Evening:Snacks", "4:00 PM\tCut Fruits (1 cup) Buttermilk (1 glass)\n" +
                "5:30 PM\tTea with Less Sugar and Milk (1 teacup)"));
        arrDiet.add(new dietModel(R.raw.pancookingfooddiet, "Night:Dinner", "8:50 PM\tMixed Vegetable Salad (1 katori)\n" +
                "9:00 PM\tDal (1 katori) Lauki Sabzi (1 katori)"));

        recyclerDietAdapter adapter = new recyclerDietAdapter(this, arrDiet);
        dietRecyclerViewList.setAdapter(adapter);

    }
}