package com.example.tom10.a99namesofallahswt;

import android.content.Context;
import android.view.*;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by tom10 on 2017-12-08.
 */

public class ItemAdapter extends BaseAdapter {
    LayoutInflater mInflater;
    String[] listOfNames;
    String[] listOfNames_desc;

    public ItemAdapter(Context c, String[] n, String[] d) {
        listOfNames = n;
        listOfNames_desc = d;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return listOfNames.length;
    }

    @Override
    public Object getItem(int i) {
        return listOfNames[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = mInflater.inflate(R.layout.layoutresourcefile, null);
        TextView nameTextView = v.findViewById(R.id.nameTextView);
        TextView descTextView = v.findViewById(R.id.descTextView);

        String name = listOfNames[i];
        String desc = listOfNames_desc[i];

        nameTextView.setText(name);
        nameTextView.setTextSize(18);
        descTextView.setText(desc);
        descTextView.setTextSize(16);

        return v;
    }
}
