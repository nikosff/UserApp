package com.nicolasfanin.myuserapp.di;

import com.nicolasfanin.myuserapp.ui.fragments.SplashFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {UserAppModule.class})
public interface UserAppComponent {

    void inject(SplashFragment splashFragment);

}
