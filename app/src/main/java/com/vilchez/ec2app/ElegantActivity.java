package com.vilchez.ec2app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class ElegantActivity extends AppCompatActivity {

    MaterialButton furnitureButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elegant);

        furnitureButton = findViewById(R.id.furniture_button);

        furnitureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ElegantActivity.this, ChairActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }



}