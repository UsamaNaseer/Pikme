package com.asadbaig.android.pikme;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class history_rides extends Fragment {


    public history_rides() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View v = inflater.inflate(R.layout.fragment_history_rides,null,false);

        ApiInterface service = RetrofitBuilder.retrofit.create(ApiInterface.class);
        Call<GetRidesResponseModel> call = service.getRidesData(1);
        call.enqueue(new Callback<GetRidesResponseModel>() {
            @Override
            public void onResponse(Call<GetRidesResponseModel> call, Response<GetRidesResponseModel> response) {

                GetRidesResponseModel getRidesResponseModel = response.body();


                ListView history_rides = (ListView) v.findViewById(R.id.history_rides);
                HistoryAdapter customAdapter = new HistoryAdapter(getContext(), R.layout.list_item_history, getRidesResponseModel.getHistory());
                history_rides.setAdapter(customAdapter);



            }

            @Override
            public void onFailure(Call<GetRidesResponseModel> call, Throwable t) {

            }
        });


        // Inflate the layout for this fragment
        return v;
    }

}
