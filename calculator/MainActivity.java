package com.example.calulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4;
    EditText et1,et2;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        btn1=findViewById(R.id.bt1);
        btn2=findViewById(R.id.bt2);
        btn3=findViewById(R.id.bt3);
        btn4=findViewById(R.id.bt4);
        res=findViewById(R.id.res);




    }

    public void add(View view) {
        float a=Float.parseFloat(et1.getText().toString());
        float b=Float.parseFloat(et2.getText().toString());
        float sum=a+b;
        res.setText(Float.toString(sum));
    }

    public void sub(View view) {
        float a=Float.parseFloat(String.valueOf(et1.getText()));
        float b=Float.parseFloat(String.valueOf(et2.getText()));
        float sub=a-b;
        res.setText(Float.toString(sub));
    }

    public void mul(View view) {
        float a=Float.parseFloat(String.valueOf(et1.getText()));
        float b=Float.parseFloat(String.valueOf(et2.getText()));
        float product=a*b;
        res.setText(Float.toString(product));
    }

    public void div(View view) {
        float a=Float.parseFloat(String.valueOf(et1.getText()));
        float b=Float.parseFloat(String.valueOf(et2.getText()));
        if(b==0)
        {
            res.setText("");
            Toast.makeText(this,"division by zero is not allowed",Toast.LENGTH_LONG).show();

        }
        else {
            float d = a / b;
            res.setText(Float.toString(d));
        }
    }
}