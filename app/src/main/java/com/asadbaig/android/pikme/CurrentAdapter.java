package com.asadbaig.android.pikme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by dell on 2/23/2018.
 */

public class CurrentAdapter extends ArrayAdapter<HistoryItem> {

    public CurrentAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public CurrentAdapter(Context context, int resource, HistoryItem[] items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.list_item_current, null);
        }

        HistoryItem p = getItem(position);

        if (p != null) {
            TextView datetime = (TextView) v.findViewById(R.id.reserved_seat1);
            TextView noofSeats = (TextView) v.findViewById(R.id.reserved1_seat1);
            TextView from_place = (TextView) v.findViewById(R.id.from_place1);
            TextView to_place = (TextView) v.findViewById(R.id.to_place1);

            TextView price = (TextView) v.findViewById(R.id.price1);


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

            if (price != null) {
                price.setText(p.getPrice());
            }

        }



        return v;
    }

}