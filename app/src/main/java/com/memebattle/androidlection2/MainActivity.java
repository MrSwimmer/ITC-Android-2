package com.memebattle.androidlection2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;

    Button plus;
    Button minus;
    Button div;
    Button umnozh;

    EditText numOne;
    EditText numTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        div = findViewById(R.id.div);
        umnozh = findViewById(R.id.umnozh);

        result = findViewById(R.id.result);

        numOne = findViewById(R.id.numOne);
        numTwo = findViewById(R.id.numTwo);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int one = Integer.parseInt(numOne.getText().toString());
                int two = Integer.parseInt(numTwo.getText().toString());
                int res = one + two;
                result.setText(res+"");
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int one = Integer.parseInt(numOne.getText().toString());
                int two = Integer.parseInt(numTwo.getText().toString());
                int res = one - two;
                result.setText(res+"");
            }
        });

        umnozh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int one = Integer.parseInt(numOne.getText().toString());
                int two = Integer.parseInt(numTwo.getText().toString());
                int res = one * two;
                result.setText(res+"");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int one = Integer.parseInt(numOne.getText().toString());
                int two = Integer.parseInt(numTwo.getText().toString());
                int res = one / two;
                result.setText(res+"");
            }
        });
    }
}

