package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.user);
        e2=findViewById(R.id.pwd);
        btn=(Button)findViewById(R.id.button);


    }

    public void log(View view) {
        String u=e1.getText().toString();
        String p=e2.getText().toString();
        if(u.equals("hasna") && p.equals("12345"))
        {
            Toast.makeText(this,"login successfully",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this,"login failed",Toast.LENGTH_SHORT).show();
        }
    }
}