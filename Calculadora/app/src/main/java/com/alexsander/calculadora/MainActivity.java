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
    private Button btn04;
    private Button btn05;
    private Button btn06;
    private Button btn07;
    private Button btn08;
    private Button btn09;
    private Button btnmais;
    private Button btnmenos;
    private Button btndivide;
    private Button btnmultiplica;
    private Button btnigual;
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

        btn04 = (Button) findViewById(R.id.btn04);
        btn04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvisor.setText("4");
            }
        });

        btn05 = (Button) findViewById(R.id.btn05);
        btn05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvisor.setText("5");
            }
        });

        btn06 = (Button) findViewById(R.id.btn06);
        btn06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvisor.setText("6");
            }
        });

        btn07 = (Button) findViewById(R.id.btn07);
        btn07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvisor.setText("7");
            }
        });

        btn08 = (Button) findViewById(R.id.btn08);
        btn08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvisor.setText("8");
            }
        });

        btn09 = (Button) findViewById(R.id.btn09);
        btn09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvisor.setText("9");
            }
        });

        btnmais = (Button) findViewById(R.id.btnmais);
        btnmais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvisor.setText("+");
            }
        });

        btnmenos = (Button) findViewById(R.id.btnmenos);
        btnmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvisor.setText("-");
            }
        });

        btnmultiplica = (Button) findViewById(R.id.btnmultiplica);
        btnmultiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvisor.setText("*");
            }
        });

        btndivide = (Button) findViewById(R.id.btndivide);
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvisor.setText("/");
            }
        });

        btnigual = (Button) findViewById(R.id.btnigual);
        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvisor.setText("=");
            }
        });
    }
}