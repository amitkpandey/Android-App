package com.csci150.newsapp.entirenews;

import android.app.Application;

import net.danlew.android.joda.JodaTimeAndroid;

/**
 * Created by Shifatul Islam (Denocyte) on 10/22/2017 11:33 PM.
 * A listing app, where you can find everything in one place.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        JodaTimeAndroid.init(this);
    }
}
