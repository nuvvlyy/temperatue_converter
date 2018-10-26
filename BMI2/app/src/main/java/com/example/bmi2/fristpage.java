package com.example.bmi2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class fristpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fristpage);
        Button start = findViewById(R.id.START);
        start.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
//                Toast T1 = Toast.makeText(fristpage.this,"esus got",Toast.LENGTH_SHORT);
//                T1.show();
                AlertDialog.Builder b = new AlertDialog.Builder(fristpage.this);
                b.setTitle("โปรดเลือก");
                b.setMessage("กด Ok หากต้องการไปหน้าถัดไป");
                b.setCancelable(false); //กดภายนอกไม่ได้
               b.setPositiveButton("cancle", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                b.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(fristpage.this,EGOT.class);
                        startActivity(i); // ขึ้นหน้าใหม่
                    }
                });
                b.show();



            }
        });
    }
}

