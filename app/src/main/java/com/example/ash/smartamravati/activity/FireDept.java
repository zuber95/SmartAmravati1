package com.example.ash.smartamravati.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ash.smartamravati.R;

public class FireDept extends AppCompatActivity implements View.OnClickListener{
public ImageView imageView;
public TextView text12;
public CardView cardView;
    public TextView text13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_dept);
        imageView=(ImageView)findViewById(R.id.imageView);
        imageView.setOnClickListener(this);
        text12=(TextView)findViewById(R.id.text12);
        text12.setOnClickListener(this);
        text13=(TextView)findViewById(R.id.text13);
        text13.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view==imageView)
        {
            Intent tp4=new Intent(FireDept.this,Nocprevious.class);
            startActivity(tp4);
        }
        if(view==text12)
        {
            Intent tp4=new Intent(FireDept.this,Nocprevious.class);
            startActivity(tp4);
        }
        if(view==text13)
        {
            Intent tp5=new Intent(FireDept.this,NocFinal1.class);
            startActivity(tp5);
        }

    }
}
