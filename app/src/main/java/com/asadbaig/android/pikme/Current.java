package com.asadbaig.android.pikme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;

import me.anwarshahriar.calligrapher.Calligrapher;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Asad Baig on 1/21/2018.
 */

public class Current extends android.support.v4.app.Fragment {
    ImageButton ridesBtn;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.current, container, false);


        ApiInterface service = RetrofitBuilder.retrofit.create(ApiInterface.class);
        Call<GetRidesResponseModel> call = service.getRidesData(1);
        call.enqueue(new Callback<GetRidesResponseModel>() {
            @Override
            public void onResponse(Call<GetRidesResponseModel> call, Response<GetRidesResponseModel> response) {

                GetRidesResponseModel getRidesResponseModel = response.body();



                if(getRidesResponseModel.getCurrent() !=null) {
                    ListView current_rides = (ListView) rootView.findViewById(R.id.current_rides);
                    CurrentAdapter customAdapter = new CurrentAdapter(getContext(), R.layout.list_item_current, getRidesResponseModel.getCurrent());
                    current_rides.setAdapter(customAdapter);
                }


            }

            @Override
            public void onFailure(Call<GetRidesResponseModel> call, Throwable t) {

            }
        });


        Calligrapher calligrapher=new Calligrapher(getActivity());
        calligrapher.setFont(getActivity(),"Lato-Semibold.ttf",true);
        return rootView;



    }

}