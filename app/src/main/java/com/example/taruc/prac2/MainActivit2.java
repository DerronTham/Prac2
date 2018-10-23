package com.example.taruc.prac2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivit2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activit2);
        Log.d("test1","Hello Wor");

        Log.w("warning","hello"); // D = debug , I = info, W = warning, E = error

    }
}
