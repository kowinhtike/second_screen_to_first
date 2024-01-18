package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Recycler extends AppCompatActivity {

    RecyclerView recyclerView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<MyItem> itemList = generateItemList();
        MyAdapter adapter = new MyAdapter(itemList);
        recyclerView.setAdapter(adapter);
    }

    private List<MyItem> generateItemList() {
        List<MyItem> itemList = new ArrayList<>();
        itemList.add(new MyItem("Item 1","2000"));
        itemList.add(new MyItem("Item 2","3000"));
        itemList.add(new MyItem("Item 3","50000"));
        // Add more items as needed
        return itemList;
    }
}