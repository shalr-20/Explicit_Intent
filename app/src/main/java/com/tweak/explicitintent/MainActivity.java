package com.tweak.explicitintent;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.tweak.explicitintent.R;

public class MainActivity extends AppCompatActivity {
    TextView ac, em, by, ud, co;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ac = findViewById(R.id.apnaclg);
        em = findViewById(R.id.extmar);
        by = findViewById(R.id.byju);
        ud = findViewById(R.id.udem);
        co = findViewById(R.id.course);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView clickedTextView = (TextView) v;
                String data = clickedTextView.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("dataname", data); // (key-value pair) Pass the data to the second activity
                startActivity(intent);
            }
        };

        ac.setOnClickListener(listener);
        em.setOnClickListener(listener);
        by.setOnClickListener(listener);
        ud.setOnClickListener(listener);
        co.setOnClickListener(listener);
    }
}
