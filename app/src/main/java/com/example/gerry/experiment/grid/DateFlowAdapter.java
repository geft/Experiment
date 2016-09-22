package com.example.gerry.experiment.grid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.gerry.experiment.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/**
 * Created by Gerry on 22/09/2016.
 */

class DateFlowAdapter extends BaseAdapter{

    private LayoutInflater inflater;
    private List<Calendar> content;

    DateFlowAdapter(LayoutInflater inflater, List<Calendar> content) {
        this.inflater = inflater;
        this.content = content;
    }

    @Override
    public int getCount() {
        return content.size();
    }

    @Override
    public Object getItem(int position) {
        return content.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Holder holder = new Holder();

        if (view == null) {
            view = inflater.inflate(R.layout.adapter_date_flow_item, viewGroup, false);
            holder.date = (TextView) view.findViewById(R.id.item_date);
            holder.day = (TextView) view.findViewById(R.id.item_day);

            view.setTag(holder);
        } else {
            holder = (Holder) view.getTag();
        }

        Calendar calendar = content.get(position);
        holder.date.setText(String.valueOf(calendar.get(Calendar.DATE)));
        holder.day.setText(new SimpleDateFormat("EE", Locale.US).format(calendar.getTime()));

        return view;
    }

    private static class Holder {
        TextView date;
        TextView day;
    }
}
