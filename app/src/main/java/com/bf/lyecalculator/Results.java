package com.bf.lyecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Results extends AppCompatActivity {
    private TextView results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        results = findViewById(R.id.cal_lye_value);

        if(getIntent().getStringExtra("Lye")!=null){
            results.setText(getIntent().getStringExtra("Lye"));
        }



    }
}