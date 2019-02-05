package com.nicolasfanin.myuserapp.ui.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nicolasfanin.myuserapp.R;
import com.nicolasfanin.myuserapp.di.DaggerUserAppComponent;
import com.nicolasfanin.myuserapp.di.UserAppComponent;
import com.nicolasfanin.myuserapp.mvp.presenters.SplashPresenter;
import com.nicolasfanin.myuserapp.mvp.views.SplashView;

import javax.inject.Inject;

/**
 * Splash view.
 */
public class SplashFragment extends BaseFragment implements SplashView {

    private View rootView;
    private UserAppComponent userAppComponent;
    private SplashNavigationListener navigationListener;

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
        navigationListener = (SplashNavigationListener) getActivity();

        presenter.waitSplashTimer();
    }

    @Override
    public void onResume() {
        presenter.attachView(this);
        super.onResume();
    }

    @Override
    public void navigateToLoginScreen() {
        navigationListener.navigateToLoginScreen();
    }

    public interface SplashNavigationListener {

        void navigateToHomeScreen();

        void navigateToLoginScreen();
    }
}
