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
import com.nicolasfanin.myuserapp.mvp.presenters.LoginPresenter;
import com.nicolasfanin.myuserapp.mvp.views.LoginView;

import javax.inject.Inject;

/**
 * Login screen
 */
public class LoginFragment extends BaseFragment implements LoginView {

    private View rootView;
    private UserAppComponent userAppComponent;

    @Inject
    LoginPresenter presenter;

    public LoginFragment() {
        userAppComponent = DaggerUserAppComponent.builder().build();
        userAppComponent.inject(this);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        rootView = inflater.inflate(R.layout.login_fragment, container, false);

        return rootView;
    }

    @Override
    public void onResume() {
        presenter.attachView(this);
        super.onResume();
    }
}
