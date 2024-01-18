package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomActivity extends AppCompatActivity {

    ListView listView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
        listView = findViewById(R.id.listView);

        // Sample data
        List<CustomItem> itemList = new ArrayList<>();
        itemList.add(new CustomItem("Item 1", "Description 1","date1",R.drawable.img1));
        itemList.add(new CustomItem("Item 2", "Description 2","date2",R.drawable.img2));
        // Add more items as needed

        CustomAdapter adapter = new CustomAdapter(this, itemList);
        listView.setAdapter(adapter);
    }
}