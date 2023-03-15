package com.hmcoding.stearcount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void stearCount(int n, String steps) {
        if (n==0) {
            System.out.println(steps);
        } else if (n==1) {
            System.out.println(steps+"1");
        } else {
            stearCount(n - 1, steps+"1 ");
            stearCount(n - 2, steps+"2 ");
        }
    }


}