package com.example.ash.smartamravati.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ash.smartamravati.R;

public class AllService extends AppCompatActivity implements View.OnClickListener{
   public ImageView image;
   public TextView text;
    public TextView text13;
    public TextView text15;
    public TextView text17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_service);
        image=(ImageView) findViewById(R.id.image);
        image.setOnClickListener(this);
        text=(TextView)findViewById(R.id.text);
        text.setOnClickListener(this);
        text13=(TextView)findViewById(R.id.text13);
        text13.setOnClickListener(this);
        text15=(TextView)findViewById(R.id.text15);
        text15.setOnClickListener(this);
        text17=(TextView)findViewById(R.id.text17);
        text17.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view==image)
        {
            Intent tp5=new Intent(AllService.this,Healthdept.class);
            startActivity(tp5);
        }
        if(view==text)
        {
            Intent tp6= new Intent(AllService.this,Healthdept.class);
            startActivity(tp6);
        }
        if(view==text13)
        {
            Intent tp7= new Intent(AllService.this,FireDept.class);
            startActivity(tp7);
        }
        if (view==text15)
        {
            Intent tp8=new Intent(AllService.this,WaterDepartment.class);
            startActivity(tp8);
        }
        if (view==text17)
        {
            Intent tp9=new Intent(AllService.this,MarriageCertificate.class);
            startActivity(tp9);
        }

    }
}
