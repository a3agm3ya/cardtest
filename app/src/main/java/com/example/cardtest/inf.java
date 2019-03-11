package com.example.cardtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class inf extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inf);
    }

    public void sample(View v) {
        TextView a = findViewById(R.id.edtxt1);
        a.setText("submitted");

    }
}
