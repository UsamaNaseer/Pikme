package com.asadbaig.android.pikme;

/**
 * Created by Izhar on 9/21/2017.
 */


import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("getProfile?op=getProfile")
    Call<GetProfileResposeModel> getProfileData(@Query("user_id") int id);

    @GET("getColors?op=getColors")
    Call<List<GetColorResponseModel>> getColorData();

    @GET("getRides?op=getRides")
    Call<GetRidesResponseModel> getRidesData(@Query("user_id") int id);

    @GET("getVehicleTypes?op=getVehicleTypes")
    Call<List<GetVehiceTypeResponseModel>> getVehicleTypesData();

    @GET("checkUserExist?op=checkUserExist")
    Call<CheckUserResponseModel> checkUserExist(@Query("email") String email);

    @GET("deleteVehicle?op=deleteVehicle")
    Call<CheckUserResponseModel> deleteVehicle(@Query("Vehicle_id") String vehicalId);

    @GET("forgetPassword?op=forgetPassword")
    Call<CheckUserResponseModel> forgetPassword(@Query("email") String email);

    @GET("getBrands?op=getBrands")
    Call<getBrandsResModel> getBrands();

}