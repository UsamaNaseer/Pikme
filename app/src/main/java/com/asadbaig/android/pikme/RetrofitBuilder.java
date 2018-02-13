package com.asadbaig.android.pikme;

import com.google.android.gms.common.api.Api;

import retrofit2.Retrofit;

/**
 * Created by usamanaseer on 12/02/2018.
 */

public class RetrofitBuilder {
    static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .build();


}
