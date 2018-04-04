package io.neverstoplearning.advancedandroid.base;

import android.app.Application;
import android.os.Build;

import javax.inject.Inject;

import io.neverstoplearning.advancedandroid.BuildConfig;
import io.neverstoplearning.advancedandroid.di.ActivityInjector;
import timber.log.Timber;

/**
 * Created by Марта on 16.03.2018.
 */

public class MyApplication extends  Application{
    @Inject
    ActivityInjector activityInjector;
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        component.inject(this);
        if (BuildConfig.DEBUG){
            Timber.plant(new Timber.DebugTree());
        }
    }

    public ActivityInjector getActivityInjector() {
        return activityInjector;
    }
}
