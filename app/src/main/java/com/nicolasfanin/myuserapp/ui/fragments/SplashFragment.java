package com.nicolasfanin.myuserapp.ui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nicolasfanin.myuserapp.MyUserApplication;
import com.nicolasfanin.myuserapp.R;
import com.nicolasfanin.myuserapp.di.DaggerUserAppComponent;
import com.nicolasfanin.myuserapp.di.UserAppComponent;
import com.nicolasfanin.myuserapp.mvp.presenters.SplashPresenter;

import javax.inject.Inject;

public class SplashFragment extends BaseFragment {

    private View rootView;
    private UserAppComponent userAppComponent;

    @Inject
    SplashPresenter presenter;

    public SplashFragment() {
        userAppComponent = DaggerUserAppComponent.builder().build();
        userAppComponent.inject(this);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        rootView = inflater.inflate(R.layout.splash_fragment, container, false);

        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }
}
