package com.example.app_repaso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Calculator obj_calulator;
    private EditText num1;
    private EditText num2;
    private TextView txtResultado;
    private Button btnSumar;
    private  Button btnRestar;
    private Button btnMultiplicar;
    private Button btnDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicialize();

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarValores();
                imprimiValor(1);
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarValores();
                imprimiValor(2);
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarValores();
                imprimiValor(3);
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarValores();
                imprimiValor(4);
            }
        });

    }
    private void inicialize() {
        obj_calulator = new Calculator();
        num1 = (EditText) findViewById(R.id.txtNum1);
        num2 = (EditText) findViewById(R.id.txtNum2);
        txtResultado = (TextView) findViewById(R.id.txtResultado);
        btnSumar = (Button) findViewById(R.id.btnSumar);
        btnRestar = (Button) findViewById(R.id.btnRestar);
        btnMultiplicar = (Button) findViewById(R.id.btnMultip);
        btnDividir = (Button) findViewById(R.id.btnDiv);
    }

    private void iniciarValores() {
        obj_calulator.setNumero1(Integer.parseInt(String.valueOf(num1.getText())));
        obj_calulator.setNumero2(Integer.parseInt(num2.getText().toString()));
    }

    private void imprimiValor(int oper) {
        obj_calulator.setResultado(oper);
        txtResultado.setText(String.valueOf(obj_calulator.getResultado()));
    }

}