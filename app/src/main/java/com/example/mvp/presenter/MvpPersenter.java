package com.example.mvp.presenter;

import androidx.lifecycle.LifecycleOwner;

import com.example.mvp.bean.GetBean;
import com.example.mvp.bean.PostBean;
import com.example.mvp.constroct.MvpConstroct;
import com.example.mvp.network.BaseObserver;
import com.example.mvp.network.RetrofitUtils;

import java.util.List;

public class MvpPersenter implements MvpConstroct.MvpListener {
    public MvpConstroct.MvpView mvpView;
    private LifecycleOwner owner;

    public MvpPersenter(MvpConstroct.MvpView mvpView, LifecycleOwner owner) {
        this.mvpView = mvpView;
        this.owner = owner;
        mvpView.setOnResult(this);
    }

    @Override
    public void getHttps() {
        RetrofitUtils.getHttps(owner, new BaseObserver<List<GetBean>>() {
            @Override
            public void onSuccess(List<GetBean> result) {
                mvpView.onHttpsResult(result);
            }

            @Override
            public void onFailure(Throwable e, String errorMsg) {

            }
        });
    }

    @Override
    public void getGsons(String keyword) {
        RetrofitUtils.getGsons(keyword, owner, new BaseObserver<PostBean>() {
            @Override
            public void onSuccess(PostBean result) {
                mvpView.onGsonsResult(result);
            }

            @Override
            public void onFailure(Throwable e, String errorMsg) {

            }
        });
    }
}
