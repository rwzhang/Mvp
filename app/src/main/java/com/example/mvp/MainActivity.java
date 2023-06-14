package com.example.mvp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;

import android.os.Bundle;

import com.example.mvp.bean.GetBean;
import com.example.mvp.bean.PostBean;
import com.example.mvp.constroct.MvpConstroct;
import com.example.mvp.presenter.MvpPersenter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MvpConstroct.MvpView {
    private MvpConstroct.MvpListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listener = new MvpPersenter(this, this);
        listener.getHttps();
        listener.getGsons("鸿洋");
    }


    @Override
    public void setOnResult(MvpConstroct.MvpListener listener) {
        this.listener = listener;
    }

    @Override
    public LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override
    public void onHttpsResult(List<GetBean> result) {
        if (result != null) {

        }
    }

    @Override
    public void onGsonsResult(PostBean result) {
        if (result != null) {

        }
    }
}