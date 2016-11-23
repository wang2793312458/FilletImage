package com.example.filletimage;

/**
 * Created by Administrator on 2016/11/21 0021.
 */

public class Utils {
    private static long lastClickTime;

    public static boolean isFastDoubleClick() {
        long time = System.currentTimeMillis();
        long timeD = time - lastClickTime;
        if (0 < timeD && timeD < 5000) {
            return false;
        }
        lastClickTime = time;
        return true;
    }
}
