package com.example.bmi2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EGOT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egot);
        final EditText esus1 = findViewById(R.id.num1);
        final EditText esus2 = findViewById(R.id.num2);
        Button b1 = findViewById(R.id.eiei);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(esus1.getText().toString());
                int n2 = Integer.parseInt(esus2.getText().toString());
                    AlertDialog.Builder b = new AlertDialog.Builder(EGOT.this);
                    b.setTitle("sum");
                    b.setMessage(n1+" + "+n2+" = "+ (n1+n2));
                    b.setCancelable(false); //กดภายนอกไม่ได้
                    b.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
                    b.show();


            }
        }
        );
    }
}
