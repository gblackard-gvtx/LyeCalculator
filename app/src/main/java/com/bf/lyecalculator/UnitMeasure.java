package com.bf.lyecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.util.Measure;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UnitMeasure extends AppCompatActivity {
    private Button ounce;
    private Button grams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_measure);

        ounce = findViewById(R.id.button_ounce);
        grams = findViewById(R.id.button_grams);

        ounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UnitMeasure.this, Superfat.class);
                startActivity(intent);
            }
        });
        grams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UnitMeasure.this, Superfat.class);
                startActivity(intent);
            }
        });
    }
}