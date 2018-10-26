package com.example.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.temperatureconverter.model.temperatue;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button  ftoc = findViewById(R.id.FToC);


        ftoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView T = findViewById(R.id.editText);
                double  number = Double.parseDouble(T.getText().toString());
                temperatue temp = new temperatue(number);
                TextView T1 = findViewById(R.id.textView);
                T1.setText(temp.getconverttoC());
            }
        });
        Button  ctof = findViewById(R.id.CToF);
        ctof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView T = findViewById(R.id.editText);
                double  number = Double.parseDouble(T.getText().toString());
                temperatue temp = new temperatue(number);
                TextView T1 = findViewById(R.id.textView);
                T1.setText(temp.getconverttoF());

            }
        });
        }
    }

