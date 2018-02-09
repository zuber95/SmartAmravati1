package com.example.ash.smartamravati.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.example.ash.smartamravati.R;

public class MarketLicence extends AppCompatActivity {
    EditText editText3;
    Button button14;
    DatabaseReference rootRef,demoRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_licence);
        editText3 = (EditText) findViewById(R.id.editText3);
        button14 = (Button) findViewById(R.id.button14);
        rootRef = FirebaseDatabase.getInstance().getReference();
        //database reference pointing to demo node
        demoRef = rootRef.child("Users");
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText3.getText().toString();
                //push creates a unique id in database
                demoRef.push().setValue(value);

            }
        });
    }
}
