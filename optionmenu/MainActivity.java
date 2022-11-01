package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent=new Intent();
        switch (item.getItemId())
        {
            case R.id.option:
                intent=new Intent(this,MainActivity2.class);
                startActivity(intent);
                break;
            case R.id.dropdown_menu:
                intent=new Intent(this,MainActivity3.class);
                startActivity(intent);
                break;
            default:return super.onOptionsItemSelected(item);
        }
        return false;
    }
}