package com.khizrpardhan.thenamesofallah;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class ItemAdapter extends BaseAdapter {
    LayoutInflater mInflater;
    String[] listOfNames;
    String[] listOfNames_desc;

    public ItemAdapter(Context c, String[] n, String[] d) {
        listOfNames = n;
        listOfNames_desc = d;
        mInflater = ( LayoutInflater ) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
