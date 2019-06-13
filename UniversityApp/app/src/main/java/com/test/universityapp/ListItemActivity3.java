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
public class ListItemActivity3 extends AppCompatActivity {

    ListView listView3;
    private String[] nationaluniversityName;
    private int[] nationaluniLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item_activity_3);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        listView3 = (ListView) findViewById(R.id.listofactivity3);
        nationaluniversityName = getResources().getStringArray(R.array.national_university);
        nationaluniLogo = new int[]{R.drawable.na_dh_commercecollage, R.drawable.na_dhaka_collage, R.drawable.na_dhakacitycollage_logo, R.drawable.na_mohila_collage

        };

        CustomAdepter adepter = new CustomAdepter(this,nationaluniversityName,nationaluniLogo);
        listView3.setAdapter(adepter);

        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity3_1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity3_2.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity3_3.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity3_4.class);
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