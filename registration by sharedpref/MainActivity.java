package com.example.registartionbysharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    RadioGroup r;
    RadioButton m,f;
    Button b;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.fname);
        e2=findViewById(R.id.lname);
        r=findViewById(R.id.gen);
        m=findViewById(R.id.male);
        f=findViewById(R.id.female);
    }

    public void reg(View view) {
        SharedPreferences sh=getSharedPreferences("MYPREF", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sh.edit();
        String gender="";
        editor.putString("Fname",e1.getText().toString());
        editor.putString("Lname",e2.getText().toString());
        switch (r.getCheckedRadioButtonId())
        {
            case R.id.male:gender="Male";
                break;
            case R.id.female:gender="Female";
                break;
            default:break;
        }
        editor.putString("Gender",gender);
        editor.apply();
        Intent i=new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(i);

    }
}