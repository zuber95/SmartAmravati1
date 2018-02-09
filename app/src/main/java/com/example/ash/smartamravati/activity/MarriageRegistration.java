package com.example.ash.smartamravati.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ash.smartamravati.R;

public class MarriageRegistration extends AppCompatActivity implements View.OnClickListener{
    public Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marriage_registration);
        button6=(Button)findViewById(R.id.button6);
        button6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view==button6)
        {
            Intent tp6= new Intent(MarriageRegistration.this,MarriageRegNext.class);
            startActivity(tp6);
        }
    }
}
