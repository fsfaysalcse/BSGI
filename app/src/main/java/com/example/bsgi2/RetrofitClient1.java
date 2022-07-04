package com.example.bsgi2;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient1 {

    private static Retrofit retrofit;
    private static  String BASE_URL = "https://bsgi.org.bd/";

    public static Retrofit getRetrofitInstance(){

        if (retrofit== null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();



        }

        return retrofit;

    }


}
