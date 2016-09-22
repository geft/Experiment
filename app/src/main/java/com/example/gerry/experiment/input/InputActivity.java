package com.example.gerry.experiment.input;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.gerry.experiment.R;
import com.example.gerry.experiment.databinding.ActivityInputBinding;

import java.util.ArrayList;
import java.util.List;

public class InputActivity extends AppCompatActivity {

    ActivityInputBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_input);
        binding.setPresenter(new InputPresenter());
        binding.setOnClick(view -> {});
    }

    private RecyclerView getRecyclerView() {
        RecyclerView recyclerView = binding.recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new InputAdapter(this, getTestItems()));

        return recyclerView;
    }

    private List<InputTestItem> getTestItems() {
        List<InputTestItem> items = new ArrayList<>();
        items.add(new InputTestItem("AAA", "aaa"));
        items.add(new InputTestItem("BBB", "bbb"));
        items.add(new InputTestItem("CCC", "ccc"));

        return items;
    }
}
