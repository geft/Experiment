package com.example.gerry.experiment.input;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.support.annotation.NonNull;
import android.widget.EditText;

import com.example.gerry.experiment.R;
import com.example.gerry.experiment.common.ResourceUtil;

/**
 * Created by Gerry on 10/09/2016.
 */
public class InputPresenter extends BaseObservable {

    private static final String SECRET = "secret";

    private String title;
    private EditText textField;

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(com.example.gerry.experiment.BR.title);
    }

    @Bindable
    private EditText getTextField() {
        return textField;
    }

    public void setTextField(EditText textField) {
        this.textField = textField;
        notifyPropertyChanged(com.example.gerry.experiment.BR.textField);
    }

    public void handleOkButton() {
        if (getTextFieldString().equalsIgnoreCase(SECRET)) {
            setTitle(ResourceUtil.getString(R.string.input_hello_secret));
        }
    }

    @NonNull
    private String getTextFieldString() {
        return getTextField().getText().toString();
    }
}
