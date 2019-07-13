package com.responsi.mvp.rest;

import com.responsi.mvp.model.Response;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET ("people")
    Call<Response>getpeople();
}
