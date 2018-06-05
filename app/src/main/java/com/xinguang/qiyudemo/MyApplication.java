package com.xinguang.qiyudemo;

import android.app.Application;

import com.xinguang.qiyulib.UnicornSDK;


/**
 * Created by vitozhang on 2018/6/4.
 */

public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        UnicornSDK.init(this, "your key").apply();
    }

}
