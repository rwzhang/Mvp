package com.example.mvp.repository;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;


import com.example.mvp.bean.BaseResponse;
import com.example.mvp.bean.GetBean;
import com.example.mvp.bean.PostBean;
import com.example.mvp.network.BasseObserver;

import java.util.List;

public class LiveDataHttpRepository extends BaseRepository {
     public MutableLiveData<List<GetBean>> liveDataResult=new MutableLiveData<>();
     public MutableLiveData<PostBean> livedataPost=new MutableLiveData<>();
    public void getLiveDataHttps(LifecycleOwner owner){
        mainApi.getHttps("6666666", 190000).observe(owner, new BasseObserver<List<GetBean>>() {

            @Override
            public void onResult(List<GetBean> result) {
                liveDataResult.postValue(result);
            }

            @Override
            public void onError(BaseResponse error) {

            }
        });
    }
    public void getLiveDataPost(LifecycleOwner owner,String keyword){
        mainApi.postJson("6666666",keyword).observe(owner,new BasseObserver<PostBean>(){

            @Override
            public void onResult(PostBean result) {
                livedataPost.postValue(result);
            }

            @Override
            public void onError(BaseResponse error) {

            }
        });
    }
}
