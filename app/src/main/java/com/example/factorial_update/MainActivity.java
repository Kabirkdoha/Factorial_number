package com.example.factorial_update;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText input;
    Button show;
    TextView tvsq,tvFact;
    int square , factorial = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        input = findViewById(R.id.etinput);
        show = findViewById(R.id.btnShow);
        tvsq = findViewById(R.id.tv1);
        tvFact = findViewById(R.id.tv2);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int inputValue = Integer.parseInt(input.getText().toString());
                square = inputValue*inputValue;
                for(int i= inputValue;i>=1;i--){
                    factorial=factorial*i;
                }
                tvsq.setText("the square is"+square);
                tvFact.setText("Factorial of "+inputValue+"is"+factorial);
            }
        });
    }
}