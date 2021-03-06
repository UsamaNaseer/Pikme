package com.asadbaig.android.pikme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import me.anwarshahriar.calligrapher.Calligrapher;

/**
 * Created by Asad Baig on 1/30/2018.
 */

public class FragOffer extends android.support.v4.app.Fragment {
Button btnCont;
ImageView burger;
    CardView cvOrigin,cvDest;
    public FragOffer() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_offer_ride, container, false);
        Calligrapher calligrapher=new Calligrapher(getActivity());
        calligrapher.setFont(getActivity(),"Lato-Semibold.ttf",true);

        cvOrigin=(CardView) rootView.findViewById(R.id.cvOrigin);
        cvDest=(CardView) rootView.findViewById(R.id.cvDestination);
        btnCont=rootView.findViewById(R.id.btn_continue);
        btnCont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),AddaCar.class);
                startActivity(i);
            }
        });
        burger=(ImageView) rootView.findViewById(R.id.burger);

        burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),navigationDrawer.class);
                startActivity(i);
            }
        });


        cvOrigin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),PlacesAutoCompleteActivity.class);
                startActivity(i);
            }
        });

        cvDest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),PlacesAutoCompleteActivity.class);
                startActivity(i);
            }
        });

        return rootView;
    }

}
