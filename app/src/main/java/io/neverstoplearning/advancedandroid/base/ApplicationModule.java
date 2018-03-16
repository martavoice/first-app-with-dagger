package io.neverstoplearning.advancedandroid.base;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Марта on 16.03.2018.
 */

@Module
public class ApplicationModule {
    private final Application application;

    ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    Context provideApplicationContext(){
        return application;
    }
}

