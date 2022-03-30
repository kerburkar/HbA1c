package com.kerimeburcukaratas.diabetsa1c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
           @Override
            public void run(){
               startActivity(new Intent(MainActivity.this, MainActivity2.class));
           }
        },4000);
    }
}