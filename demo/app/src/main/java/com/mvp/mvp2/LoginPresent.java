package com.mvp.mvp2;

import android.util.Log;

/**
 * Created by Administrator on 2017/9/20.
 */

public class LoginPresent extends BasePresent<ILoginAction, MvpActivity> {

    public LoginPresent(ILoginAction view, MvpActivity activity) {
        super(view, activity);
    }

    public void login(String user, String password) {
        if (user.equals("admin") && password.equals("admin")) {
            getView().sucess();
        } else {
            getView().error();
        }
    }
}
