package com.asadbaig.android.pikme;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import java.util.List;

import me.anwarshahriar.calligrapher.Calligrapher;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Asad Baig on 1/21/2018.
 */

public class FragRides extends android.support.v4.app.Fragment {
ImageButton findRide,offerRide;

    public FragRides() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.rides, container, false);

        Calligrapher calligrapher=new Calligrapher(getActivity());
        calligrapher.setFont(getActivity(),"Lato-Semibold.ttf",true);
        findRide=rootView.findViewById(R.id.findride);
        offerRide=rootView.findViewById(R.id.offerride);

findRide.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(getActivity(),FindRide.class);
        startActivity(i);

    }
});

        ApiInterface service = RetrofitBuilder.retrofit.create(ApiInterface.class);



        Call<List<GetVehiceTypeResponseModel>> call1 = service.getVehicleTypesData();
        call1.enqueue(new Callback<List<GetVehiceTypeResponseModel>>() {
            @Override
            public void onResponse(Call<List<GetVehiceTypeResponseModel>> call, Response<List<GetVehiceTypeResponseModel>> response) {

            }

            @Override
            public void onFailure(Call<List<GetVehiceTypeResponseModel>> call, Throwable t) {

            }
        });




        return rootView;}

}