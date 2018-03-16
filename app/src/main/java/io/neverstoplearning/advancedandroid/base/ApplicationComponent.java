package io.neverstoplearning.advancedandroid.base;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Марта on 16.03.2018.
 */

@Singleton
@Component(modules = {ApplicationModule.class,
        ActivityBindingModule.class,})
public interface ApplicationComponent {
    void inject(MyApplication myApplication);
}
