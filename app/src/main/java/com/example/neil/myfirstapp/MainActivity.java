package com.example.neil.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView txtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Buoc 2: Anh xa
        txtv = (TextView) findViewById(R.id.textView_Hoten);

        // Buoc 3: Viet code
        txtv.setText("Hello World");

    }
}
