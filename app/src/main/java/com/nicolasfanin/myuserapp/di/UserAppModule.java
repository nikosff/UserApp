package com.nicolasfanin.myuserapp.di;

import com.nicolasfanin.myuserapp.mvp.presenters.LoginPresenter;
import com.nicolasfanin.myuserapp.mvp.presenters.SplashPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class UserAppModule {

    @Provides
    @Singleton
    SplashPresenter provideSplashPresenter() {
        return new SplashPresenter();
    }

    @Provides
    @Singleton
    LoginPresenter provideLoginPresenter() {
        return new LoginPresenter();
    }
}
