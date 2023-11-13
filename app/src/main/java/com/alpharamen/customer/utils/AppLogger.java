package com.alpharamen.customer.utils;

import android.util.Log;

import com.alpharamen.customer.BuildConfig;

public class AppLogger {

    public static final String TAG = "TODO SALUD";

    public AppLogger() {
    }

    public static void d(String message) {
        if (BuildConfig.DEBUG) {
            Log.d(TAG, message != null ? message : "");
        }
    }

    public static void e(String message) {
        if (BuildConfig.DEBUG) {
            Log.e(TAG, message != null ? message : "");
        }
    }

    public static void i(String message) {
        if (BuildConfig.DEBUG) {
            Log.i(TAG, message != null ? message : "");
        }
    }
}
