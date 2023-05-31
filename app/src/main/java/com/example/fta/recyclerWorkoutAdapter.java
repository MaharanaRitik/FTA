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

public class recyclerWorkoutAdapter extends RecyclerView.Adapter<recyclerWorkoutAdapter.ViewHolder> {

    Context context;
    ArrayList<exerciseModel> arrExercise;
    recyclerWorkoutAdapter(Context context, ArrayList<exerciseModel> arrExercise){
        this.context=context;
        this.arrExercise=arrExercise;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View exView = LayoutInflater.from(context).inflate(R.layout.workout_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(exView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        holder.exLot.setAnimation(arrExercise.get(position).lotti);
        holder.txtName.setText(arrExercise.get(position).exName);
        holder.txtTime.setText(arrExercise.get(position).exTime);
        holder.txtDes.setText(arrExercise.get(position).exDesc);

        holder.exLot.playAnimation();

        holder.exLot.setRepeatCount(LottieDrawable.INFINITE);
        if (position==1) {
            holder.exLot.setRepeatMode(LottieDrawable.REVERSE);
            holder.exLot.setSpeed(2.5f);
        }


    }

    @Override
    public int getItemCount() {
        return arrExercise.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        LottieAnimationView exLot;
        TextView txtName, txtTime, txtDes;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            exLot=itemView.findViewById(R.id.exLottie);
            txtName=itemView.findViewById(R.id.exName);
            txtTime=itemView.findViewById(R.id.exTime);
            txtDes=itemView.findViewById(R.id.exDesc);
        }
    }
}
