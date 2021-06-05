package com.sksm.ssg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class CustomListAdapter extends BaseAdapter {
    private Context context;
    ArrayList<ArrayList<String>> items;
    // ArrayList<String> items;

    // Public constructor
    public CustomListAdapter(Context context,ArrayList<ArrayList<String>> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v=view;
        LayoutInflater _inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (v == null) {
            v = _inflater.inflate(R.layout.list_item, null);
        }
        // Set Width of ListView to MATCH_PARENT
        viewGroup.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        // Get the TextView and ImageView from CustomView for displaying item

        TextView txtview1 = (TextView) v.findViewById(R.id.listitemTextView1);
        TextView txtview2 = (TextView) v.findViewById(R.id.listitemTextView2);
        TextView txtview3 = (TextView) v.findViewById(R.id.listitemTextView3);


        // Set the text and image for current item using data from map list
        txtview1.setText(items.get(i).get(2));
        txtview2.setText(items.get(i).get(3));
        txtview3.setText(items.get(i).get(1));

        return v;

    }
}