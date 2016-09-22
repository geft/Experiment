package com.example.gerry.experiment.input;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Gerry on 19/09/2016.
 */
public class InputAdapter extends RecyclerView.Adapter<InputAdapterViewHolder> {

    private LayoutInflater inflater;
    private List<InputTestItem> itemList;

    InputAdapter(Context context, List<InputTestItem> itemList) {
        this.inflater = LayoutInflater.from(context);
        this.itemList = itemList;
    }

    @Override
    public InputAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return InputAdapterViewHolder.create(inflater, parent);
    }

    @Override
    public void onBindViewHolder(InputAdapterViewHolder holder, int position) {
        holder.bindTo(itemList.get(position));
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
