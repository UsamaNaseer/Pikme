package com.asadbaig.android.pikme;

/**
 * Created by Izhar on 9/21/2017.
 */


import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("getProfile/")
    Call<GetProfileResposeModel> getData(@Query("user_id") int id);


}