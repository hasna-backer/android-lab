package com.example.pgm7new;

//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//}

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int images[] ={R.drawable.img1, R.drawable.img2};
    int currentindex=0;
    Button btn;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        iv=findViewById(R.id.imageView);

    }

    public void Click(View view) {
        currentindex();
    }

    private void currentindex() {
        switch(currentindex){
            case 0:iv.setImageResource(images[1]);
                currentindex=1;
                break;
            case 1:iv.setImageResource(images[0]);
                currentindex=0;
                break;

        }
    }
}