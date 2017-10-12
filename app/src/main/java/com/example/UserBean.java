package com.example;

import android.databinding.ObservableField;

public class UserBean {
  
    public ObservableField<String> name = new ObservableField<>();
    public ObservableField<String> sex = new ObservableField<>();  
    public ObservableField<Integer> age = new ObservableField<>() ;  
  
    public UserBean(){  
        name.set("张三");  
        sex.set("男");  
        age.set(19);  
    }  
  
}