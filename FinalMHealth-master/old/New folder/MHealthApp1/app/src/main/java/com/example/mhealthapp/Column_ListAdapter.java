package com.example.mhealthapp;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

//For Connecting ListView
public class Column_ListAdapter extends ArrayAdapter<User> {

    // Takes adapter_view_layout xml to view
    private LayoutInflater mInflater;
    private ArrayList<User> users;
    private int mViewResourceid;


    public Column_ListAdapter(Context context, int mViewResourceid, ArrayList<User> users) {
        super(context, mViewResourceid, users);
        this.users = users;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.mViewResourceid = mViewResourceid;
    }

    public View getView(int position, View convertView, ViewGroup parents) {
        convertView = mInflater.inflate(mViewResourceid, null);
        User user = users.get(position);
        if (user != null) {
            TextView medicine_name = (TextView) convertView.findViewById(R.id.Med_name_txt);
            TextView medicine_dose = (TextView) convertView.findViewById(R.id.dose_txt);
            TextView medicine_food = (TextView) convertView.findViewById(R.id.food_txt);
            TextView medicine_time = (TextView) convertView.findViewById(R.id.time_txt);

            if (medicine_name != null) {
                medicine_name.setText(user.getMed_txt());
            }
            if (medicine_dose != null) {
                medicine_dose.setText(user.getDose_txt());
            }
            if (medicine_food != null) {
                medicine_food.setText(user.getFood_txt());
            }
            if (medicine_time != null) {
                medicine_time.setText(user.getTime_txt());
            }
        }
        return convertView;
    }
}