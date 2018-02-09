package com.example.ash.smartamravati.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ash.smartamravati.R;

public class NocFinal1 extends AppCompatActivity  implements View.OnClickListener{
public Button Fnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noc_final1);
        Fnext=(Button)findViewById(R.id.Fnext);
        Fnext.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view==Fnext)
        {
            Intent tp6=new Intent(NocFinal1.this,NocFinal2.class);
            startActivity(tp6);
        }

    }
}
