package com.example.gerry.experiment.input;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.gerry.experiment.databinding.AdapterInputBinding;

/**
 * Created by Gerry on 19/09/2016.
 */
class InputAdapterViewHolder extends RecyclerView.ViewHolder {

    private AdapterInputBinding binding;

    static InputAdapterViewHolder create(LayoutInflater inflater, ViewGroup parent) {
        AdapterInputBinding binding = AdapterInputBinding.inflate(inflater, parent, false);

        return new InputAdapterViewHolder(binding);
    }

    private InputAdapterViewHolder(AdapterInputBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    void bindTo(InputTestItem item) {
        binding.setTestItem(item);
        binding.executePendingBindings();
    }
}
