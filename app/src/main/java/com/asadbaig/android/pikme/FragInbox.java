package com.asadbaig.android.pikme;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import me.anwarshahriar.calligrapher.Calligrapher;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragInbox extends Fragment {
CardView cardView;
    ImageView burger;

    public FragInbox() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r=inflater.inflate(R.layout.fragment_inbox, container, false);

        Calligrapher calligrapher=new Calligrapher(getActivity());
        calligrapher.setFont(getActivity(),"Lato-Semibold.ttf",true);

burger=(ImageView) r.findViewById(R.id.burger);

        burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),navigationDrawer.class);
                startActivity(i);
            }
        });

        cardView=(CardView) r.findViewById(R.id.chat_view);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),chatActivity.class);
            startActivity(i);
            }
        });


        return r;
    }
}
