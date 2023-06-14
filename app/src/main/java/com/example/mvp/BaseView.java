package com.example.mvp;

import androidx.lifecycle.LifecycleOwner;

import com.example.mvp.presenter.BasePersenter;

public interface BaseView<T extends BasePersenter> {

    void setOnResult(T listener);

    LifecycleOwner getLifecycleOwner();
}
