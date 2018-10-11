package com.example.sathya.tabsample;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class PlayerViewAdapater extends RecyclerView.Adapter<PlayerViewHolder> {

    List<Player> playerList;
    Context context;

    PlayerViewAdapater(Context context, List<Player> players){
        this.playerList = players;
        this.context = context;
    }

    @NonNull
    @Override
    public PlayerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.my_list_view, viewGroup, false);
        PlayerViewHolder playerViewHolder = new PlayerViewHolder(view);
        return playerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PlayerViewHolder playerViewHolder, int i) {

        playerViewHolder.imageView.setImageResource(R.mipmap.ic_launcher_round);
        playerViewHolder.name.setText(playerList.get(i).name);
        playerViewHolder.battingStyle.setText(playerList.get(i).battingStyle);

        playerViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,SecondActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return playerList.size();
    }
}