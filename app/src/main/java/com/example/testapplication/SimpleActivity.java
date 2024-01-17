package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SimpleActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        listView = findViewById(R.id.listView);
        ArrayList<String> things = new ArrayList<>();
        things.add("One");
        things.add("Two");
        things.add("Three");
        String[] items = {"item1","item2","item3"};
        //This adapter can use with string array or ArrayList
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,things);
        listView.setAdapter(adapter);
    }
}


