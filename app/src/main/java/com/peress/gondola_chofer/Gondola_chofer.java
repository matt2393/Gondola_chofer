package com.peress.gondola_chofer;

import android.app.Application;

/**
 * Created by matt on 18-11-17.
 */

public class Gondola_chofer extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseInit.initDatabase();
    }
}
