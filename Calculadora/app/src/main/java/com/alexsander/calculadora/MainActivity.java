package com.alexsander.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn01;
    private Button btn02;
    private Button btn03;
    private TextView txtvisor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtvisor = (TextView) findViewById(R.id.txtvisor);

        btn01 = (Button) findViewById(R.id.btn01);
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvisor.setText("1");
            }
        });

        btn02 = (Button) findViewById(R.id.btn02);
        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvisor.setText("2");
            }
        });

        btn03 = (Button) findViewById(R.id.btn03);
        btn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvisor.setText("3");
            }
        });
    }
}