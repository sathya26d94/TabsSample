package com.example.sathya.tabsample;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PlaceholderFragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    Context context;

    private static final String ARG_SECTION_NUMBER = "section_number";

    public PlaceholderFragment() {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            recyclerView = rootView.findViewById(R.id.recycler_view);
            layoutManager = new LinearLayoutManager(context);

            List<Player> playerList = new ArrayList<>();

            if (getArguments().getInt(ARG_SECTION_NUMBER) == 1) {
                Player s1 = new Player("S Dhawan", "L Batsman");
                Player s2 = new Player("R Sharma", "R Batsman");
                Player s3 = new Player("V Kohli", "R Batsman");
                Player s4 = new Player("KL Rahul", "R Batsman");
                Player s5 = new Player("S Raina", "L Batsman");
                Player s6 = new Player("MS Dhoni", "R Batsman");
                Player s7 = new Player("H Pandya", "R Batsman");
                Player s8 = new Player("U Yadav", "R Batsman");
                Player s9 = new Player("K Yadav", "L Batsman");
                Player s10 = new Player("I Sharma", "R Batsman");
                Player s11 = new Player("J Bumrah", "R Batsman");
                playerList.add(s1);
                playerList.add(s2);
                playerList.add(s3);
                playerList.add(s4);
                playerList.add(s5);
                playerList.add(s6);
                playerList.add(s7);
                playerList.add(s8);
            } else {
                Player s1 = new Player("Steven Smith", "R Batsman");
                Player s2 = new Player("Tim Paine", "R Batsman");
                Player s3 = new Player("Aaron Finch", "L Batsman");
                Player s4 = new Player("Travis Head", "R Batsman");
                Player s5 = new Player("Nic Maddinson", "L Batsman");
                Player s6 = new Player("Glenn Maxwell", "R Batsman");
                Player s7 = new Player("Jhye Richardson", "R Batsman");
                Player s8 = new Player("D Arcy Short", "R Batsman");
                Player s9 = new Player("Andrew Tye", "L Batsman");
                Player s10 = new Player("Marcus Stoinis", "R Batsman");
                Player s11 = new Player("Jack Wildermuth", "R Batsman");
                playerList.add(s1);
                playerList.add(s2);
                playerList.add(s3);
                playerList.add(s4);
                playerList.add(s5);
                playerList.add(s6);
                playerList.add(s7);
                playerList.add(s8);
            }

            PlayerViewAdapater playerViewAdapater = new PlayerViewAdapater(context, playerList);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(playerViewAdapater);
            return rootView;
        }
    }