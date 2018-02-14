package com.asadbaig.android.pikme;

/**
 * Created by Izhar on 9/21/2017.
 */


import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("getProfile?op=getProfile")
    Call<GetProfileResposeModel> getProfileData(@Query("user_id") int id);

    @GET("getColors?op=getColors")
    Call<ListGetColorModel> getColorData();

    @GET("getRides?op=getRides")
    Call<GetRidesResponseModel> getRidesData(@Query("user_id") int id);



}