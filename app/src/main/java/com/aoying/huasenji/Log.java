package com.aoying.huasenji;

public class Log {

    public static void v(String key, String value) {
        if (Constant.isLog) {
            android.util.Log.v(key, value);
        }
    }

    public static void i(String key, String value) {
        if (Constant.isLog) {
            android.util.Log.i(key, value);
        }
    }

    public static void d(String key, String value) {
        if (Constant.isLog) {
            android.util.Log.d(key, value);
        }
    }

    public static void w(String key, String value) {
        if (Constant.isLog) {
            android.util.Log.w(key, value);
        }
    }

    public static void e(String key, String value) {
        if (Constant.isLog) {
            android.util.Log.e(key, value);
        }
    }
}
