package com.example.bmlcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private class MyListner implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            log.d("bmi","ok");
        }
    }

}
