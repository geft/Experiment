package com.example.gerry.experiment.grid;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridView;

import com.example.gerry.experiment.R;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Gerry on 22/09/2016.
 */

public class DateFlowDialog extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.dialog_date_flow, null, false);
        GridView gridView = (GridView) view.findViewById(R.id.grid_view);

        DateFlowAdapter adapter = new DateFlowAdapter(inflater, getCalendarList());
        gridView.setAdapter(adapter);

        return new AlertDialog.Builder(getActivity())
                .setView(view)
                .setNeutralButton(R.string.date_flow_close, (dialogInterface, i) -> dismiss())
                .create();
    }

    private List<Calendar> getCalendarList() {
        List<Calendar> list = new ArrayList<>();

        int gridSize = 9;
        int gridLimit = (gridSize - 1) / 2;

        for (int i = -gridLimit; i < gridLimit + 1; i++) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.DATE, i);

            list.add(calendar);
        }

        return list;
    }
}
