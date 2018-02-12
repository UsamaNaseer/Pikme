package com.asadbaig.android.pikme;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

import me.anwarshahriar.calligrapher.Calligrapher;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    Button pickMe,sendRequest,finishN;
    ImageButton cancel,accept;
    RelativeLayout rlCarInfo,rlAccept;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        Calligrapher calligrapher=new Calligrapher(this);
        calligrapher.setFont(this,"Lato-Semibold.ttf",true);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        pickMe=(Button) findViewById(R.id.btn_pickMe);
        sendRequest=(Button) findViewById(R.id.btn_sendRq);
        finishN=(Button) findViewById(R.id.btn_finishN);
        cancel=(ImageButton) findViewById(R.id.btn_cancel);
        accept=(ImageButton)findViewById(R.id.btn_accept);
        rlAccept=(RelativeLayout) findViewById(R.id.rlAccept);
        rlCarInfo=(RelativeLayout) findViewById(R.id.rlCarLoc);






        pickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pickMe.setVisibility(View.GONE);
                rlCarInfo.setVisibility(View.VISIBLE);


            }
        });
        sendRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rlCarInfo.setVisibility(View.GONE);
                rlAccept.setVisibility(View.VISIBLE);

            }
        });

        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rlAccept.setVisibility(View.GONE);
                finishN.setVisibility(View.VISIBLE);
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rlAccept.setVisibility(View.GONE);
            }
        });

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        //  mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
