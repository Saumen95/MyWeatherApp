package com.example.weatherapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class API{
    public static final String BASE_URL = "http://api.openweathermap.org/data/2.5/";
    public static final String KEY = "75dc8accc7736c3d4b424e1727f9b26a";
    private static Retrofit retrofit = null;

    public static Retrofit getapi(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }


}