package com.example.bsgi2;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UserService {

    @FormUrlEncoded
    @POST("login")
    Call<LoginResponse> userlogin(@Field("email") String email, @Field("password") String password);

    @GET("member_search")
    Call<Model1> getAllData();
}
