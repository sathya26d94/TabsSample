package com.example.sathya.tabsample;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sathya.tabsample.R;

public class PlayerViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView name;
    TextView battingStyle;

    public PlayerViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.img1);
        name = itemView.findViewById(R.id.name);
        battingStyle = itemView.findViewById(R.id.battingStyle);
    }
}