package com.example.calculator999;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button B9,B8,B7,B6,B5,B4,B3,B2,B1,min,mul,div,plus,neg,dot,submit;
    TextView main, history;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}