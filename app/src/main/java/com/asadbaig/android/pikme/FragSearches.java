package com.asadbaig.android.pikme;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import me.anwarshahriar.calligrapher.Calligrapher;

/**
 * Created by Asad Baig on 1/30/2018.
 */

public class FragSearches extends android.support.v4.app.Fragment {

ImageView burger;
    public FragSearches() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_searches, container, false);
        Calligrapher calligrapher=new Calligrapher(getActivity());
        calligrapher.setFont(getActivity(),"Lato-Semibold.ttf",true);
        burger=(ImageView) rootView.findViewById(R.id.burger);

        burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),navigationDrawer.class);
                startActivity(i);
            }
        });
        return rootView;}

}

