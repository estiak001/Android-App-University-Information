package com.test.universityapp;

import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import android.widget.BaseAdapter;

public class CustomAdepter extends BaseAdapter {

    int[] university_logo;
    String[] university_name;
    Context context;
    LayoutInflater inflater;



    CustomAdepter(Context context, String[] universityname, int[] unilogo) {
        this.context = context;
        this.university_name = universityname;
        this.university_logo = unilogo;
    }


    @Override
    public int getCount() {
        return university_name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {



        if(convertView == null)
        {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView =  inflater.inflate(R.layout.sample_layout, parent, false);

            convertView.setBackgroundResource(R.drawable.round_corner);
        }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageId);
        TextView textView = convertView.findViewById(R.id.uni_name);
        imageView.setImageResource(university_logo[position]);
        textView.setText(university_name[position]);

        return convertView;
    }
}