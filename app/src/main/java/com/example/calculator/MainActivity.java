package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btndot,btnplus,btnminus,btndivide,btnmult,btnmod,btnequal,btnsqrt,btnpow,btnac;
    TextView tvDisplay,tvCalculation;
    boolean isClear = false;
    Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculator = new Calculator();

        btn1 = findViewById(R.id.one);
        btn2 = findViewById(R.id.two);
        btn3 = findViewById(R.id.three);
        btn0 = findViewById(R.id.zero);
        btn4 = findViewById(R.id.four);
        btn5 = findViewById(R.id.five);
        btn6 = findViewById(R.id.six);
        btn7 = findViewById(R.id.seven);
        btn9 = findViewById(R.id.nine);


        btndot = findViewById(R.id.dot);
        btn8 = findViewById(R.id.eight);

        btnplus = findViewById(R.id.plus);
        btnminus = findViewById(R.id.minus);
        btnmult = findViewById(R.id.multiply);
        btndivide = findViewById(R.id.divide);
        btnsqrt=findViewById(R.id.square);
        btnpow = findViewById(R.id.power);
        btnequal = findViewById(R.id.equal);
        btnac=findViewById(R.id.AC);


        tvDisplay=findViewById(R.id.tvDisplay);
        tvCalculation = findViewById(R.id.calculation);


        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.setOperand2(Double.parseDouble(tvDisplay.getText().toString()));
                tvCalculation.append(calculator.getOperand2()+" =");
                tvDisplay.setText(Double.toString(calculator.calculation()));
            }
        });

        btnac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText("");
            }
        });


    }

    public void btnDigitClick(View view) {
        if (isClear){
            tvDisplay.setText("");
            isClear = false;
        }
        tvDisplay.append(((Button)view).getText().toString());

    }

    public void operatorOnClick(View view) {

        isClear = true;
        calculator.setOperand1(Double.parseDouble(tvDisplay.getText().toString()));
        calculator.setOperator(((Button)view).getText().toString().charAt(0));

        tvCalculation.setText(tvDisplay.getText().toString()+" "+calculator.getOperator()+" ");

    }
    }