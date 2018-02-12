package com.asadbaig.android.pikme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import me.anwarshahriar.calligrapher.Calligrapher;

/**
 * Created by Asad Baig on 1/21/2018.
 */

public class Current extends android.support.v4.app.Fragment {
    ImageButton ridesBtn;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.current, container, false);

        Calligrapher calligrapher=new Calligrapher(getActivity());
        calligrapher.setFont(getActivity(),"Lato-Semibold.ttf",true);
        return rootView;



    }

}