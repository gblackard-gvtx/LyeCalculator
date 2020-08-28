package com.bf.lyecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ingredients extends AppCompatActivity {
    private EditText oliveOilWeight;
    private EditText palmOilWeight;
    private EditText cocoaButterWeight;
    private EditText sheaButterWeight;
    private Button next;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredients);
        oliveOilWeight = findViewById(R.id.editText_oil_weight_1);
        EditText coconutOilWeight = findViewById(R.id.editText_oil_weight_2);
        palmOilWeight = findViewById(R.id.editText_oil_weight_3);
        cocoaButterWeight = findViewById(R.id.editText_oil_weight_4);
        sheaButterWeight = findViewById(R.id.editText_oil_weight_5);
        next = findViewById(R.id.button_ind_next);



        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ingredients.this, Results.class);
                String temp = oliveOilWeight.getText().toString();
                //String sfValue = (getIntent().getStringExtra("finalSfValue"));
                //double nsfValue = Double.parseDouble(sfValue);
                //double mod = 1;
                int value = 0;
                if (!"".equals(temp)){
                    value = (int) Double.parseDouble(temp);
                }
                    double oowLye = 0;
                    double ooNAOH = 0.135;
                   oowLye = ((ooNAOH * value));
                System.out.println(oowLye);
                    intent.putExtra("Lye",String.valueOf(oowLye));
                startActivity(intent);
            }
        });
    }
}