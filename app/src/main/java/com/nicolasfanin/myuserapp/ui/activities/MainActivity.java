package com.nicolasfanin.myuserapp.ui.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.nicolasfanin.myuserapp.R;
import com.nicolasfanin.myuserapp.ui.Navigator;
import com.nicolasfanin.myuserapp.ui.fragments.SplashFragment;

public class MainActivity extends AppCompatActivity {

    private Navigator navigator;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout_activity);

        navigator = new Navigator(this, getSupportFragmentManager(), R.id.fragment_container, savedInstanceState);

        //init and go to first screen.
        navigateToSplashScreen();
    }

    public void navigateToSplashScreen() {
        navigator.navigateTo(new SplashFragment());
    }

    public void navigateToLoginScreen() {

    }

    public void navigateToHomeScreen() {

    }
}
