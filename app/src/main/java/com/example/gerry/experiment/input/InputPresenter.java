package com.example.gerry.experiment.input;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.support.annotation.NonNull;
import android.widget.EditText;

import com.example.gerry.experiment.databinding.ActivityInputBinding;
import com.example.gerry.experiment.grid.DateFlowDialog;

/**
 * Created by Gerry on 10/09/2016.
 */
public class InputPresenter extends BaseObservable {

    private static final String SECRET = "secret";

    private String title;
    private EditText textField;

    InputPresenter(ActivityInputBinding binding) {
        textField = binding.editTextInput;
    }

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

    void handleOkButton(Context context) {
        if (getTextFieldString().equalsIgnoreCase(SECRET)) {
            DateFlowDialog dialog = new DateFlowDialog();
            dialog.show(
                    ((InputActivity) context).getFragmentManager(), this.getClass().getName()
            );
        }
    }

    @NonNull
    private String getTextFieldString() {
        return getTextField().getText().toString();
    }
}
