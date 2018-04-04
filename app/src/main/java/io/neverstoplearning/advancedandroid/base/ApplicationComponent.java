package io.neverstoplearning.advancedandroid.base;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;
import io.neverstoplearning.advancedandroid.data.RepoService;
import io.neverstoplearning.advancedandroid.data.RepoServiceModule;
import io.neverstoplearning.advancedandroid.networking.ServiceModule;

/**
 * Created by Марта on 16.03.2018.
 */

@Singleton
@Component(modules = {ApplicationModule.class,
        ActivityBindingModule.class,
        ServiceModule.class,
        RepoServiceModule.class,
})
public interface ApplicationComponent {
    void inject(MyApplication myApplication);
}
