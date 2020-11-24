package com.example.dataepl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImageBitmaps();
    }

    private void initImageBitmaps(){

        mImageUrls.add("https://resources.premierleague.com/premierleague/badges/t13.svg");
        mNames.add("Leicester City");

        mImageUrls.add("https://resources.premierleague.com/premierleague/badges/t3.svg");
        mNames.add("Arsenal");

        mImageUrls.add("https://resources.premierleague.com/premierleague/badges/t7.svg");
        mNames.add("Aston Villa");

        mImageUrls.add("https://resources.premierleague.com/premierleague/badges/t90.svg");
        mNames.add("Burnley");

        mImageUrls.add("https://resources.premierleague.com/premierleague/badges/t8.svg");
        mNames.add("Chelsea");

        mImageUrls.add("https://resources.premierleague.com/premierleague/badges/t31.svg");
        mNames.add("Crystal Palace");

        mImageUrls.add("https://resources.premierleague.com/premierleague/badges/t11.svg");
        mNames.add("Everton");

        mImageUrls.add("https://resources.premierleague.com/premierleague/badges/t54.svg");
        mNames.add("Fulham");

        mImageUrls.add("https://resources.premierleague.com/premierleague/badges/t2.svg");
        mNames.add("Leeds United");

        mImageUrls.add("https://resources.premierleague.com/premierleague/badges/t14.svg");
        mNames.add("Liverpool");

        initRecyclerView();
    }

    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewClubAdapter adapter = new RecyclerViewClubAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}