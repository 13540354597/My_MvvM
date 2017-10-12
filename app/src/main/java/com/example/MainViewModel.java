package com.example;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.databinding.ActivityMainBinding;


public class MainViewModel {

    private ActivityMainBinding activityMainBinding;
    //private ContentMainBinding contentMainBinding;
    private AppCompatActivity activity;

    public UserBean user;

    public MainViewModel(AppCompatActivity activity, ActivityMainBinding activityMainBinding) {
        this.activity = activity;
        this.activityMainBinding = activityMainBinding;
        //  this.contentMainBinding = activityMainBinding.contentMain;
        init();
    }

    public void init() {
//        activity.setSupportActionBar(activityMainBinding.toolbar);
//        activityMainBinding.fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        user = new UserBean();
        activityMainBinding.setViewModel(this);

    }

    public void applyUser(View v) {

        Toast.makeText(activity, "提交成功", Toast.LENGTH_SHORT).show();
        //Snackbar.make(v,"提交成功",Snackbar.LENGTH_SHORT).setAction("Action",null).show();
        user.name.set(activityMainBinding.name.getText().toString());
        user.sex.set(activityMainBinding.sex.getText().toString());
        user.age.set(Integer.valueOf(activityMainBinding.age.getText().toString()));
    }

}