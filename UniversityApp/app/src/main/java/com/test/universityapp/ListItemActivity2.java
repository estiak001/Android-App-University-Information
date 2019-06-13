package com.test.universityapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
public class ListItemActivity2 extends AppCompatActivity {

    ListView listView2;
    private String[] privateuniversityName;
    private int[] privateuniLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item_activity_1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        listView2 = (ListView) findViewById(R.id.listofactivity1);
        privateuniversityName = getResources().getStringArray(R.array.private_university);
        privateuniLogo = new int[]{R.drawable.pri_brack, R.drawable.pri_iubat, R.drawable.pri_diu, R.drawable.pri_nsu

        };

        CustomAdepter adepter = new CustomAdepter(this,privateuniversityName,privateuniLogo);
        listView2.setAdapter(adepter);

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity2_1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity2_2.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity2_3.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity2_4.class);
                    startActivityForResult(myIntent, 0);
                }


            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()== android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}