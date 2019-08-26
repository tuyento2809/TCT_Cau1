package com.example.student.tct_cau1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextA, editTextB;
    TextView textViewKQ, textViewHieu;
    Button buttonKQ, buttonHieu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextA = findViewById(R.id.editTextA);
        editTextB = findViewById(R.id.editTextB);
        textViewKQ = findViewById(R.id.textViewKQ);
        textViewHieu = findViewById(R.id.textViewHieu);
        buttonKQ = findViewById(R.id.buttonKQ);

        buttonHieu = findViewById(R.id.buttonHieu);

        buttonKQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(editTextA.getText().toString());
                int b = Integer.parseInt(editTextB.getText().toString());
                int kq = a+b;
                textViewKQ.setText("Tong la: "+kq);
            }
        });

        buttonHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(editTextA.getText().toString());
                int b = Integer.parseInt(editTextB.getText().toString());
                int kq = a-b;
                textViewKQ.setText("Hieu la: "+kq);
            }
        });
    }
}
