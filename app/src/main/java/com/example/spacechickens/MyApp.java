package com.example.spacechickens;

import android.app.Application;

import com.example.spacechickens.Utils.SharedPreferances;
import com.example.spacechickens.Utils.Signal;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Signal.init(this);
        SharedPreferances.init(this);
    }

}
