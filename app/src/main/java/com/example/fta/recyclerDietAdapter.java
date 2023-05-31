package com.example.fta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;

import java.util.ArrayList;

public class recyclerDietAdapter extends RecyclerView.Adapter<recyclerDietAdapter.ViewHolder> {

    Context contextDiet;
    ArrayList<dietModel> arrDiet;
    recyclerDietAdapter(Context contextDiet, ArrayList<dietModel> arrDiet){
        this.contextDiet=contextDiet;
        this.arrDiet=arrDiet;
    }

    @NonNull
    @Override
    public recyclerDietAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View dietView = LayoutInflater.from(contextDiet).inflate(R.layout.diet_list, parent, false);
        recyclerDietAdapter.ViewHolder viewHolder = new recyclerDietAdapter.ViewHolder(dietView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerDietAdapter.ViewHolder holder, int position) {

        holder.lottiDiet.setAnimation(arrDiet.get(position).lottiDiet);
        holder.dietTime.setText(arrDiet.get(position).dietTime);
        holder.dietDesc.setText(arrDiet.get(position).dietDesc);

        holder.lottiDiet.playAnimation();

        holder.lottiDiet.setRepeatCount(LottieDrawable.INFINITE);

    }

    @Override
    public int getItemCount() {
        return arrDiet.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        LottieAnimationView lottiDiet;
        TextView  dietTime, dietDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);



                lottiDiet=itemView.findViewById(R.id.lottieDiet);
                dietTime=itemView.findViewById(R.id.dietTime);
                dietDesc=itemView.findViewById(R.id.dietDesc);

        }
    }
}
