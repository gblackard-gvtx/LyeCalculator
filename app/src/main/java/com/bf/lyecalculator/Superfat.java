package com.bf.lyecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Superfat extends AppCompatActivity {
private Button next;
private EditText percent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_superfat);
        next = findViewById(R.id.button_super_next);
        percent = findViewById(R.id.superfat_input);



        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String temp = percent.getText().toString();
                int sfValue = 0;
                if (!"".equals(temp)) {
                    sfValue = Integer.parseInt(temp);
                }
                   double divisor = 100;
                    double nsfValue = 0;
                    nsfValue = (sfValue/ divisor);
                    System.out.println(nsfValue);
                final double finalSfValue = nsfValue;
                Intent intent =new Intent(Superfat.this, Ingredients.class);
                intent.putExtra("Superfat", finalSfValue);
                System.out.println(finalSfValue);
                startActivity(intent);
            }
        });
    }
}