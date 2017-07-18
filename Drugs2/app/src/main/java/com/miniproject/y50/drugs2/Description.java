package com.miniproject.y50.drugs2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;



public class Description extends AppCompatActivity {
    ImageView imageView;
    TextView textView,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        textView=(TextView)findViewById(R.id.textView);
        imageView=(ImageView)findViewById(R.id.imageView6);
        textView2=(TextView)findViewById(R.id.textView6);
        Intent i=getIntent();
        imageView.setImageResource(i.getIntExtra("p",2));
        textView.setText(i.getStringExtra("m"));
        textView2.setText(i.getStringExtra("t"));

    }


}