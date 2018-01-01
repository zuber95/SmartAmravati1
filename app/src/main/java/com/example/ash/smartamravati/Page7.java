package com.example.ash.smartamravati;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Page7 extends AppCompatActivity implements View.OnClickListener{

    private Button button8;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_page7);
        firebaseAuth = FirebaseAuth.getInstance();
        if(firebaseAuth.getCurrentUser() == null){
            //closing this activity
            finish();
            //starting login activity
            startActivity(new Intent(this, Page3.class));
        }
        //getting current user
        FirebaseUser user = firebaseAuth.getCurrentUser();

        //initializing views

        button8 = (Button) findViewById(R.id.button8);

        //displaying logged in user name

        //adding listener to button
        button8.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view==button8)
        {
            firebaseAuth.signOut();
            finish();
            startActivity(new Intent(this,Page3.class));
        }
    }
}
