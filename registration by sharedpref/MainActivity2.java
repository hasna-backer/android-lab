//package com.example.registartionbysharedpref;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//
//public class MainActivity2 extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main2);
//    }
//}
package com.example.registartionbysharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button b1;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1=findViewById(R.id.getdata);
        tv=findViewById(R.id.data);

    }

    public void Get(View view) {
        SharedPreferences sh=getSharedPreferences("MYPREF", Context.MODE_PRIVATE);
        tv.setText("First Name : "+sh.getString("Fname","")+"\nLast Name : "+sh.getString("Lname","")+"\nGender : "+sh.getString("Gender",""));

    }
}