package com.covid19tracker.covid19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class ChoiceActivity extends AppCompatActivity {

    TextView country,global;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        country = findViewById(R.id.country);
        global = findViewById(R.id.global);

        country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ChoiceActivity.this,countryActivity.class);
                startActivity(intent);

            }
        });


        global.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent globalintent = new Intent(ChoiceActivity.this,MainActivity.class);
                startActivity(globalintent);

            }
        });

    }
}