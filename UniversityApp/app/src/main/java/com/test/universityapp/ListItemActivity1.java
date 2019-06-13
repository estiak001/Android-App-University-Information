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
public class ListItemActivity1 extends AppCompatActivity {

    ListView listView2;
   private String[] publicuniversityName;
    private int[] publicuniLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item_activity_1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        listView2 = (ListView) findViewById(R.id.listofactivity1);
        publicuniversityName = getResources().getStringArray(R.array.public_university);
        publicuniLogo = new int[]{R.drawable.pu_du, R.drawable.pu_jogonnath, R.drawable.pu_jahangirnogor, R.drawable.pu_buet

        };

        CustomAdepter adepter = new CustomAdepter(this,publicuniversityName,publicuniLogo);
        listView2.setAdapter(adepter);

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity1_1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity1_2.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity1_3.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity1_4.class);
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