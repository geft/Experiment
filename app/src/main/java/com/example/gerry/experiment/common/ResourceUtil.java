package com.example.gerry.experiment.common;

import android.graphics.drawable.Drawable;
import android.widget.Toast;

import com.example.gerry.experiment.ExperimentApplication;

/**
 * Created by Gerry on 19/09/2016.
 */
public class ResourceUtil {
    public static String getString(int resId) {
        return ExperimentApplication.getInstance().getString(resId);
    }

    public static Drawable getDrawable(int resId) {
        return ExperimentApplication.getInstance().getDrawable(resId);
    }

    public static void showToast(String text) {
        Toast.makeText(ExperimentApplication.getInstance(), text, Toast.LENGTH_SHORT).show();
    }
}
