package com.example.example;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDex;

/**
 * @author wangzhichao
 * @since 2022/3/7
 */
public class App extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(base);
    }
}
