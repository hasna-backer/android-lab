package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.btn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next();
            }

        });
        Log.i("mytag","oncreate");
        Toast.makeText(this,"oncreate",Toast.LENGTH_SHORT).show();
    }




    @Override
    protected void onStart() {
        super.onStart();
        Log.i("mytag","onstart");
        Toast.makeText(this,"oncstart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("mytag","onresume");
        Toast.makeText(this,"onresume",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("mytag","onrestart");
        Toast.makeText(this,"onrestart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("mytag","onstop");
        Toast.makeText(this,"onstop",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("mytag","ondestroy");
        Toast.makeText(this,"ondestroy",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("mytag","onpause");
        Toast.makeText(this,"onpause",Toast.LENGTH_SHORT).show();
    }
    public void next() {
        Intent i=new Intent(this,MainActivity2.class);
        startActivity(i);
    }



}