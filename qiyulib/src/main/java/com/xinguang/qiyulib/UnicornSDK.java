package com.xinguang.qiyulib;

import android.content.Context;

import com.qiyukf.unicorn.api.StatusBarNotificationConfig;
import com.qiyukf.unicorn.api.Unicorn;
import com.qiyukf.unicorn.api.UnicornImageLoader;
import com.qiyukf.unicorn.api.YSFOptions;

/**
 * Created by vitozhang on 2018/6/5.
 */

public class UnicornSDK {


    private Context context;

    private String appKey;

    private YSFOptions options;

    private UnicornImageLoader imageLoader;

    public static UnicornSDK init(Context context, String appKey) {
        return new UnicornSDK(context, appKey);
    }

    private UnicornSDK(Context context, String appKey) {
        this.context = context;
        this.appKey = appKey;
    }

    public UnicornSDK setOptions(YSFOptions options) {
        this.options = options;
        return this;
    }

    public UnicornSDK setImageLoader(UnicornImageLoader imageLoader) {
        this.imageLoader = imageLoader;
        return this;
    }

    public void apply() {

        if (options == null) {
            options = options();
        }

        if (imageLoader == null) {
            imageLoader = new GlideImageLoader(context);
        }

        Unicorn.init(context, appKey, options, imageLoader);
    }

    // 如果返回值为null，则全部使用默认参数。
    private static YSFOptions options() {
        YSFOptions options = new YSFOptions();
        options.statusBarNotificationConfig = new StatusBarNotificationConfig();
        return options;
    }


}
