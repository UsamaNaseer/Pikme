package com.asadbaig.android.pikme;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import me.anwarshahriar.calligrapher.Calligrapher;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Asad Baig on 1/30/2018.
 */

public class FragProfile extends android.support.v4.app.Fragment{
ImageView burger;
TextView name,email,pass,mobilenum;

public FragProfile() {
        // Required empty public constructor
        }

@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
                         Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);
        Calligrapher calligrapher=new Calligrapher(getActivity());
        calligrapher.setFont(getActivity(),"Lato-Semibold.ttf",true);
        burger=(ImageView) rootView.findViewById(R.id.burger);
        name=(TextView) rootView.findViewById(R.id.reserved_seat);
        email=(TextView) rootView.findViewById(R.id.reserved_seat1);
        pass=(TextView) rootView.findViewById(R.id.reserved_seat2);
        mobilenum=(TextView) rootView.findViewById(R.id.reserved_seat3);




        burger.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                        Intent i=new Intent(getActivity(),navigationDrawer.class);
                        startActivity(i);
                }
        });

        ApiInterface service = RetrofitBuilder.retrofit.create(ApiInterface.class);
        Call<GetProfileResposeModel> call = service.getProfileData(1);
        call.enqueue(new Callback<GetProfileResposeModel>() {
                @Override
                public void onResponse(Call<GetProfileResposeModel> call, Response<GetProfileResposeModel> response) {
                        GetProfileResposeModel getProfileResposeModel = response.body();
                        name.setText(getProfileResposeModel.getFname());
                        email.setText(getProfileResposeModel.getEmail());
                        pass.setText(getProfileResposeModel.getPassword());
                        mobilenum.setText(getProfileResposeModel.getNumber());


                }

                @Override
                public void onFailure(Call<GetProfileResposeModel> call, Throwable t) {

                }
        });

        Call<ListGetColorModel> call1 = service.getColorData();
        call1.enqueue(new Callback<ListGetColorModel>() {
                @Override
                public void onResponse(Call<ListGetColorModel> call, Response<ListGetColorModel> response) {

                }

                @Override
                public void onFailure(Call<ListGetColorModel> call, Throwable t) {

                }
        });

        return rootView;}





        }

