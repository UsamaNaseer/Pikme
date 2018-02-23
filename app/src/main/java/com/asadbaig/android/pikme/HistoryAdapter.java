package com.asadbaig.android.pikme;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by dell on 2/23/2018.
 */

public class HistoryAdapter extends ArrayAdapter<HistoryItem> {

public HistoryAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
        }

public HistoryAdapter(Context context, int resource, HistoryItem[] items) {
        super(context, resource, items);
        }

@Override
public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
        LayoutInflater vi;
        vi = LayoutInflater.from(getContext());
        v = vi.inflate(R.layout.list_item_history, null);
        }

        HistoryItem p = getItem(position);

        if (p != null) {
        TextView datetime = (TextView) v.findViewById(R.id.reserved_seat);
        TextView noofSeats = (TextView) v.findViewById(R.id.reserved1_seat);
        TextView from_place = (TextView) v.findViewById(R.id.from_place);
            TextView to_place = (TextView) v.findViewById(R.id.to_place);
            TextView rating = (TextView) v.findViewById(R.id.rating);
            TextView price = (TextView) v.findViewById(R.id.price);


            if (datetime != null) {
        datetime.setText(p.getDatetime());
        }

        if (noofSeats != null) {
        noofSeats.setText(p.getNo_seats());
        }

        if (from_place != null) {
        from_place.setText(p.getFrom_place());
        }

        if (to_place != null) {
                to_place.setText(p.getTo_place());
        }
        if (rating != null) {
                rating.setText(p.getRating());
        }
        if (price != null) {
                price.setText(p.getPrice());
        }

        }



        return v;
        }

        }