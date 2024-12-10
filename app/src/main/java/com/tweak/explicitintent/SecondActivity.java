package com.tweak.explicitintent;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView tv1,tv2;
    String data;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv1=findViewById(R.id.texVie1);
        tv2=findViewById(R.id.texVie2);

        // Retrieve the data passed from Previous activity
        Intent intent = getIntent();
        data = intent.getStringExtra("dataname");

        tv1.setText("Enjoy learning with "+data);
        tv2.setText(data+ " welcomes you!");
    }
}