package com.asadbaig.android.pikme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Asad Baig on 2/3/2018.
 */

public class navFragPolicy extends android.support.v4.app.Fragment {

    public navFragPolicy() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.navfragpolicy, container, false);


        return rootView;}


}
