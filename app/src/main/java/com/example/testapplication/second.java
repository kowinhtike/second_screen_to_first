package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class second extends AppCompatActivity {

    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toast.makeText(this,getIntent().getStringExtra("message"),Toast.LENGTH_LONG).show();
        button = findViewById(R.id.button);
        button.setOnClickListener(View -> {
            Intent i = new Intent();
            i.putExtra("message" , "Second Screen To First");
            setResult(RESULT_OK,i);
            finish();
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Toast.makeText(this,"Back Event",Toast.LENGTH_LONG).show();

    }
}