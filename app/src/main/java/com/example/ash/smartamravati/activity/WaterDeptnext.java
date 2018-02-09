package com.example.ash.smartamravati.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ash.smartamravati.R;

public class WaterDeptnext extends AppCompatActivity implements View.OnClickListener{
    public Button button7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_deptnext);
        button7=(Button)findViewById(R.id.button7);
        button7.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view==button7)
        {
            Intent tp7=new Intent(WaterDeptnext.this,WaterDeptNext2.class);
            startActivity(tp7);
        }
    }
}
