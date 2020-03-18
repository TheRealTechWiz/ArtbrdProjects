package com.example.artbrdprojects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<MyWord> list = new ArrayList<>();
        list.add(new MyWord(R.drawable.image_first,"Nazariyaa","3 days left",60));
        list.add(new MyWord(R.drawable.image_second,"Fruitbits","7 days left",40));
        list.add(new MyWord(R.drawable.ic_launcher_background,"Sample","0 days left",80));

        RecyclerView listView = findViewById(R.id.recycler_view);
        listView.setHasFixedSize(true);

        CustomAdapter adapter = new CustomAdapter(list);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        listView.setLayoutManager(mLayoutManager);
        listView.setAdapter(adapter);
        //listView.setItemAnimator(new DefaultItemAnimator());

        TextView tvbtn = findViewById(R.id.tvog);
        tvbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Second.class);
                startActivity(i);
            }
        });


    }
}