package com.asadbaig.android.pikme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Asad Baig on 1/21/2018.
 */

public class History extends android.support.v4.app.Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.history, container, false);


        ApiInterface service = RetrofitBuilder.retrofit.create(ApiInterface.class);
        Call<GetRidesResponseModel> call = service.getRidesData(1);
        call.enqueue(new Callback<GetRidesResponseModel>() {
            @Override
            public void onResponse(Call<GetRidesResponseModel> call, Response<GetRidesResponseModel> response) {

                GetRidesResponseModel getRidesResponseModel = response.body();


                ListView history_rides = (ListView) rootView.findViewById(R.id.history_rides);
                HistoryAdapter customAdapter = new HistoryAdapter(getContext(), R.layout.list_item_history, getRidesResponseModel.getHistory());
                history_rides.setAdapter(customAdapter);



            }

            @Override
            public void onFailure(Call<GetRidesResponseModel> call, Throwable t) {

            }
        });



        return rootView;}

}