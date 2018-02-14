package com.asadbaig.android.pikme;

import com.google.android.gms.common.api.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by usamanaseer on 12/02/2018.
 */

public class RetrofitBuilder {
    static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://service.piknow.com/services.asmx/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();


}
