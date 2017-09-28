package com.mvvm;

import android.database.DatabaseUtils;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v4.database.DatabaseUtilsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.mvp.R;
import com.mvp.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
    }


    public void open(View view) {
        User u = new User();
        u.setAge(31);
        u.setName("张三");
        u.setPhotos("http://img2.cache.netease.com/auto/2016/7/28/201607282215432cd8a.jpg");
        binding.setUser(u);
    }


}
