package com.example.gerry.experiment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class InputActivity extends AppCompatActivity {

    InputPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        InputPresenter presenter = new InputPresenter(this);
    }
}
