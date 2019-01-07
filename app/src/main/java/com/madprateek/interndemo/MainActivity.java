package com.madprateek.interndemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.HorizontalScrollView;

public class MainActivity extends AppCompatActivity {

    private HorizontalScrollView mHorizontalView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
