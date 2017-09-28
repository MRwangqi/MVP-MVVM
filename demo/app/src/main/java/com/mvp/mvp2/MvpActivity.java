package com.mvp.mvp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.mvp.R;

public class MvpActivity extends BaseActivity implements ILoginAction {


    LoginPresent present = new LoginPresent(this, this);

    @Override
    public int getLayoutId() {
        return R.layout.activity_mvp;
    }

    @Override
    protected void initView() {
    }

    public void login(View v) {
        present.login("zhangsan", "123456");
    }

    @Override
    public void sucess() {
        Toast.makeText(this, "sucess", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void error() {
        Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
    }
}
