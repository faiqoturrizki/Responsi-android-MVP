package com.responsi.mvp.rest;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ApiClient {
    public static final String BASE_URL = "https://private-0e6b9-ganjarwidiatmansyah.apiary-mock.com/";
    private static Retrofit retrofit = null;
    public ApiInterface getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(ApiInterface.class);
    }
}

