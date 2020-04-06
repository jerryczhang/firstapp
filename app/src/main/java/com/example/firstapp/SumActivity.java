package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);
    }

    public void add(View view) {
        EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
        EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
        TextView sumTextView = (TextView) findViewById(R.id.sumTextView);
        int num1 = Integer.parseInt(firstNumEditText.getText().toString());
        int num2 = Integer.parseInt(secondNumEditText.getText().toString());
        int sum = num1 + num2;
        String sumString = sum + "";
        sumTextView.setText(sumString);
    }
}
