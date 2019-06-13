package com.test.universityapp;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;

public class ListViewItemClickEventExample extends AppCompatActivity {

    ListView listView;
    private String [] values;
    Button button;

    private Button notice, importentdate, tips, more;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_item_click_event);

        listView = (ListView) findViewById(R.id.list);
        notice = findViewById(R.id.noticeId);
        importentdate =findViewById(R.id.importentID);
        tips = findViewById(R.id.tipsID);
        more = findViewById(R.id.moreID);

        notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ListViewItemClickEventExample.this, NoticeActivity.class);
                startActivity(intent);
            }
        });
        importentdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ListViewItemClickEventExample.this, ImportentDate.class);
                startActivity(intent);
            }
        });
        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ListViewItemClickEventExample.this, Tips.class);
                startActivity(intent);
            }
        });
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ListViewItemClickEventExample.this, More.class);
                startActivity(intent);
            }
        });

        values = getResources().getStringArray(R.array.university_tye);
        CustomAdepter2 adepter = new CustomAdepter2(this,values);
        listView.setAdapter(adepter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity1.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity2.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity3.class);
                    startActivityForResult(myIntent, 0);
                }


            }
        });
    }
}