package com.example.zld.login;

import android.app.Application;

import org.xutils.x;

/**
 * Created by zld on 2018/5/8.
 */

public class RegistApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG);
    }
}
