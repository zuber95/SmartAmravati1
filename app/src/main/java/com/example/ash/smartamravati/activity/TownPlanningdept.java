package com.example.ash.smartamravati.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.ash.smartamravati.R;

public class TownPlanningdept extends AppCompatActivity {
    Spinner sp;
    String name[]={"Mr." ,"Mrs"};
    ArrayAdapter <String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_town_planningdept);
         sp =(Spinner)findViewById(R.id.spinner);
         adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,name);
         sp.setAdapter(adapter);
         sp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             public String record;

             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                 switch(position)
                 {
                     case 0:
                        record ="Mr.";
                         break;
                     case 1:
                         record ="Mrs.";
                         break;
                 }
             }

         });

    }
}
