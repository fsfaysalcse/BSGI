package com.example.bsgi2;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;

public interface RetrofitAPI {

    // as we are making a post request to post a data
    // so we are annotating it with post
    // and along with that we are passing a parameter as users
    @GET("member_search")

    //on below line we are creating a method to post our data.
    Call<DataModal> createPost(@Body DataModal dataModal);
}
