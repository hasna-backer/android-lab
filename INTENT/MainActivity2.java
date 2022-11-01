package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv=findViewById(R.id.data);

        Bundle extra = getIntent().getExtras();
        String t1 = extra.getString("Name");
        String t2 = extra.getString("Place");
        tv.setText("Name: "+t1+"\nPlace: "+t2);

    }
}