package com.asadbaig.android.pikme.Modules;

import com.google.android.gms.maps.model.LatLng;



public class SearchlocationData {
    String id;

    public CharSequence getC_address() {
        return c_address;
    }

    public void setC_address(CharSequence c_address) {
        this.c_address = c_address;
    }

    CharSequence c_address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public LatLng getLatLng() {
        return latLng;
    }

    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
    }


    public CharSequence getName() {
        return name;
    }

    public void setName(CharSequence name) {
        this.name = name;
    }

    CharSequence name;
    LatLng latLng;
}
