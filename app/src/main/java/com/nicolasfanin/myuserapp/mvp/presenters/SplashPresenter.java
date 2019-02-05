package com.nicolasfanin.myuserapp.mvp.presenters;

import android.os.Handler;

import com.nicolasfanin.myuserapp.mvp.views.SplashView;

/**
 * Presenter for SplashFragment
 */
public class SplashPresenter extends BasePresenter<SplashView> {

    private SplashView view;

    public SplashPresenter() {
        super();
    }


    @Override
    public void attachView(SplashView view) {
        this.view = view;
        super.attachView(view);
    }

    /**
     * Wait until timer ends.
     */
    //TODO: this method should be replaced until the service checks are ready.
    public void waitSplashTimer() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                // Actions to do after 10 seconds
                view.navigateToLoginScreen();
            }
        }, 5000);

    }

    /**
     * Check if user is already logged in
     */
    //TODO implement this method.
    public boolean isUserAlreadyLoggedIn() {
        return false;
    }
}
