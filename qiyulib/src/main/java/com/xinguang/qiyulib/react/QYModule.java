package com.xinguang.qiyulib.react;

import android.content.Context;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.qiyukf.unicorn.api.ConsultSource;
import com.qiyukf.unicorn.api.Unicorn;

/**
 * Created by vitozhang on 2018/6/5.
 */

public class QYModule extends ReactContextBaseJavaModule{

    private static final String NAME = "QiYuTool";

    private Context mContext;

    public QYModule(ReactApplicationContext reactContext) {
        super(reactContext);
        mContext = reactContext;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void gotoCustomCare(String title){
        ConsultSource source = new ConsultSource("Main", "MainActivity", "custom information string");
        Unicorn.openServiceActivity(mContext, title, source);
    }
}
