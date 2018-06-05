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

public class QiYuModule extends ReactContextBaseJavaModule{

    /** module 的名称 **/
    private static final String NAME = "QiYuTool";

    private Context mContext;

    public QiYuModule(ReactApplicationContext reactContext) {
        super(reactContext);
        mContext = reactContext;
    }

    @Override
    public String getName() {
        return NAME;
    }

    /**
     * 跳转到客服页
     * @param title 客服标题
     */
    @ReactMethod
    public void gotoCustomCare(String title){
        ConsultSource source = new ConsultSource("Main", "MainActivity", "custom information string");
        Unicorn.openServiceActivity(mContext, title, source);
    }
}
