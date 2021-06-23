package com.example.activity5_daryltapia;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitBuilder {
    private static Retrofit retrofit;
    public static Retrofit getRetrofitInstance(){
        if (retrofit == null);{
            retrofit = new Retrofit.Builder().baseUrl("https://v6.exchangerate-api.com/").addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
