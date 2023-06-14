package com.example.mvp.repository;


import com.example.mvp.network.MainApi;
import com.example.mvp.network.RetrofitClient;

/**
     * date:2020/4/16 0016
     * time:上午 11:38
     * author:zhaoyang.cheng
     */
    public abstract class BaseRepository {
        protected MainApi mainApi = RetrofitClient.getInstance("1").getApi();
    }
