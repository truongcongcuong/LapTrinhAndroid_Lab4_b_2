package com.example.ltdd_lab4_b_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fram_Top,FragTop.newInstance()).commit();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.frm_Bot,FragBot.newInstance()).commit();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.framContent,FragContent.newInstance()).commit();
    }
}