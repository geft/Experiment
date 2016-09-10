package com.example.gerry.experiment;

import android.app.Activity;
import android.content.Context;

import butterknife.ButterKnife;

/**
 * Created by Gerry on 10/09/2016.
 */
public class BasePresenter {

    Context context;

    public BasePresenter(Context context) {
        this.context = context;
    }

    protected String getString(int resId) {
        return context.getString(resId);
    }
}
