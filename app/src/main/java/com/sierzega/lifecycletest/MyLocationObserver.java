package com.sierzega.lifecycletest;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;



public class MyLocationObserver implements LifecycleObserver {
    public final static String TAG = MyLocationObserver.class.getSimpleName();
    Lifecycle lifecycle;

    public MyLocationObserver(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void logStart(){
        Log.i(TAG, "Start");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void logPause(){
        Log.i(TAG, "Pause");
    }

    void doSth(){
        if(lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)){
            //do sth
        }
    }
}
