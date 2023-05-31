package com.example.fta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class weightGain extends AppCompatActivity {

    ArrayList<dietModel> arrDiet = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_gain);

        RecyclerView dietRecyclerViewList = findViewById(R.id.dietListGain);
        dietRecyclerViewList.setLayoutManager(new LinearLayoutManager(this));

        arrDiet.add(new dietModel(R.raw.breakfastdiet, "Morning:Breakfast", "3 paneer stuffed besan cheela + green chutney + 1 cup curd + 3 cashews + 4 almonds + 2 walnuts."));
        arrDiet.add(new dietModel(R.raw.midmealdiet, "Mid-Meal:Brunch", "1 apple smoothie with maple syrup."));
        arrDiet.add(new dietModel(R.raw.homeclocktwelvediet, "Afternoon:Lunch", "1 cup masoor dal + 1 cup calocasia + 3 chapatti + 1/2 cup rice + 1 cup low curd + salad."));
        arrDiet.add(new dietModel(R.raw.eveningdiet, "Evening:Snacks", "1 cup tomato soup with bread crumbs + 1 cup aloo chaat."));
        arrDiet.add(new dietModel(R.raw.pancookingfooddiet, "Night:Dinner", "1 cup carrot peas vegetable +3 chapatti + salad."));

        recyclerDietAdapter adapter = new recyclerDietAdapter(this, arrDiet);
        dietRecyclerViewList.setAdapter(adapter);

    }
}