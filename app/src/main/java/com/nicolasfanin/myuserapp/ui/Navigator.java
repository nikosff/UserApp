package com.nicolasfanin.myuserapp.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Own Navigator to manage navigation between fragments and Activities.
 */
public class Navigator {

    private FragmentActivity activity;
    private FragmentManager manager;
    private int layoutId;

    public Navigator (FragmentActivity activity, FragmentManager manager, int layoutId, Bundle savedInstanceState) {
        this.activity = activity;
        this.manager = manager;
        this.layoutId = layoutId;
    }

    /**
     * Navigate Between Fragments
     *
     * @param fragment
     */
    public void navigateTo(Fragment fragment) {
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        fragmentTransaction.replace(layoutId, fragment);
        fragmentTransaction.commit();
    }
}
