package com.responsi.mvp.presenter;

import android.util.Log;

import com.responsi.mvp.interfaces.MainView;
import com.responsi.mvp.model.Response;
import com.responsi.mvp.model.ResultsItem;
import com.responsi.mvp.rest.ApiClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class MainPresenter {
    MainView mainView;
    ApiClient apiClient;

    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
        if (apiClient==null){
            this.apiClient= new ApiClient();
        }
    }
    public void getpeople(){
      apiClient.getClient().getpeople().enqueue(new Callback<Response>() {
          @Override
          public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
              if (response.isSuccessful()){
                  List<ResultsItem> data = response.body().getResults();
                  mainView.ongetpeople(data);
              }
          }

          @Override
          public void onFailure(Call<Response> call, Throwable t) {

          }
      });
    }
}
