package com.example.gerry.experiment;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Gerry on 10/09/2016.
 */
public class InputPresenter extends BasePresenter {

    public static final String SECRET = "secret";

    @BindView(R.id.text_hello_world)
    TextView textHelloWorld;

    @BindView(R.id.edit_text_input)
    EditText textField;

    @BindView(R.id.button_ok)
    Button buttonOk;

    public InputPresenter(Activity activity) {
        super(activity);

        ButterKnife.bind(this, activity);
    }

    @OnClick(R.id.button_ok)
    protected void handleOkButton() {
        if (getTextFieldString().equalsIgnoreCase(SECRET)) {
            setHelloWorldText(getString(R.string.input_hello_secret));
            Toast.makeText(context, "hello", Toast.LENGTH_SHORT).show();
        }
    }

    public void setHelloWorldText(String string) {
        textHelloWorld.setText(string);
    }

    @NonNull
    public String getTextFieldString() {
        return textField.getText().toString();
    }
}
