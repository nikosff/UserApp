package com.nicolasfanin.myuserapp.mvp.presenters;

import com.nicolasfanin.myuserapp.mvp.views.BaseView;

public abstract class BasePresenter<BV extends BaseView> {

    protected BV view;

    protected BasePresenter(){

    }

    public void attachView(BV view){

    }
}
