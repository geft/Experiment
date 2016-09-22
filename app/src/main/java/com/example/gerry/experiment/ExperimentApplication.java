package com.example.gerry.experiment;

import android.app.Application;
import android.content.Context;

/**
 * Created by Gerry on 19/09/2016.
 */
public class ExperimentApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        context = getApplicationContext();
    }

    public static Context getInstance() {
        return context;
    }
}
