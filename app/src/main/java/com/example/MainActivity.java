package com.example;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding
                = DataBindingUtil.setContentView(this,R.layout.activity_main);
        MainViewModel mainViewModel = new MainViewModel(this,activityMainBinding);
    }
}
