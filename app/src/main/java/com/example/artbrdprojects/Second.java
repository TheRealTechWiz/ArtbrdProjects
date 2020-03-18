package com.example.artbrdprojects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ArrayList<MyWord> list = new ArrayList<>();
        list.add(new MyWord("green","₹399 - ₹8,500","per service"));
        list.add(new MyWord("yellow","₹500 - ₹3,000","per hour"));
        list.add(new MyWord("red","above ₹3,000","per hour"));

        RecyclerView listView = findViewById(R.id.recycler_view);

        SecondCustomAdapter adapter = new SecondCustomAdapter(list,this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);

        listView.setLayoutManager(mLayoutManager);
        listView.setAdapter(adapter);

    }
}
