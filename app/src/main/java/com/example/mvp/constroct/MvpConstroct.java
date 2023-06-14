package com.example.mvp.constroct;

import com.example.mvp.BaseView;
import com.example.mvp.bean.GetBean;
import com.example.mvp.bean.PostBean;
import com.example.mvp.presenter.BasePersenter;

import java.util.List;

/**
 * mvp模式控制器
 * @author zhangrenwei
 */
public interface MvpConstroct {
    interface  MvpView extends BaseView<MvpListener>{
        void onHttpsResult(List<GetBean> result);
        void onGsonsResult(PostBean result);

    }
    interface  MvpListener extends BasePersenter{
        void getHttps();
        void getGsons(String keyword);

    }

}
