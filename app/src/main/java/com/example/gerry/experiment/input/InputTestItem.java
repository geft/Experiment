package com.example.gerry.experiment.input;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Gerry on 19/09/2016.
 */
public class InputTestItem extends BaseObservable {
    private String name;
    private String description;

    public InputTestItem(String name) {
        this.name = name;
    }

    public InputTestItem(String description, String name) {
        this.description = description;
        this.name = name;
    }

    @Bindable
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
