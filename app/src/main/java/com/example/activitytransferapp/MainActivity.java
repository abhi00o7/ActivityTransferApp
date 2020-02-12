package com.example.activitytransferapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSecondActivity = (Button) findViewById(R.id.Activity2Btn);

        btnSecondActivity.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent();
        intent.setClass(this,activity2.class);

        startActivity(intent);

    }
}
