package com.example.testapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button6;
    Button button2;
    Button button3;

    int REQUEST_CODE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);
        textView = findViewById(R.id.textView2);
        button6 = findViewById(R.id.button6);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button6.setOnClickListener(View -> {
            textView.setText("good");
            Intent i = new Intent(this,second.class);
            i.putExtra("message","First Screen To Second");
            startActivityForResult(i,REQUEST_CODE);

        });

        button2.setOnClickListener(View -> {
            Intent i = new Intent(this,SimpleActivity.class);
            startActivity(i);
        });

        button3.setOnClickListener(View -> {
            Intent i = new Intent(this,CustomActivity.class);
            startActivity(i);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(RESULT_OK == resultCode && requestCode == REQUEST_CODE){
            Toast.makeText(this,data.getStringExtra("message"),Toast.LENGTH_LONG).show();
        }
    }
}