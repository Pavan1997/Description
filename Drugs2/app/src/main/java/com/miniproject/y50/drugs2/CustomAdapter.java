package com.miniproject.y50.drugs2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by a on 7/3/2017.
 */

public class CustomAdapter extends BaseAdapter {
    String[]names;
    Integer[] pics;
    Context context;
    public CustomAdapter(MainActivity mainActivity, String[] medicines, Integer[] images) {
        this.context=mainActivity;
        this.names=medicines;
        this.pics=images;

    }

    public CustomAdapter(String s) {
    }
    public int getCount() {
        return names.length;
    }
    public Object getItem(int position) {
        return position;
    }
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView=layoutInflater.inflate(R.layout.customadapter,null);
        TextView tv=(TextView)convertView.findViewById(R.id.textView5);


        ImageView imageView=(ImageView)convertView.findViewById(R.id.imageView2);
        tv.setText(names[position]);

        imageView.setImageResource(pics[position]);
        return convertView;

    }

}
