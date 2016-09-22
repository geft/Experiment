package com.example.gerry.experiment.input;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.example.gerry.experiment.R;
import com.example.gerry.experiment.databinding.ActivityInputBinding;

public class InputActivity extends FragmentActivity implements View.OnClickListener{

    InputPresenter presenter;
    ActivityInputBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_input);
        presenter = new InputPresenter(binding);
        binding.setPresenter(presenter);
        binding.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.equals(binding.buttonOk)) {
            presenter.handleOkButton(this);
        }
    }
}
