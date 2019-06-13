package com.test.universityapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListItemActivity1_1 extends AppCompatActivity {
    ListView listView;
    private String[] duDepartmentName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1_to_activity1_1);
        listView = (ListView) findViewById(R.id.listviewdepartmentname);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        duDepartmentName = getResources().getStringArray(R.array.du_department);


        ArrayAdapter<String> adepter = new ArrayAdapter<String>(ListItemActivity1_1.this,R.layout.sample_layout3,R.id.du_dep,duDepartmentName);

        listView.setAdapter(adepter);




    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()== android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
