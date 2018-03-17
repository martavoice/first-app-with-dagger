package io.neverstoplearning.advancedandroid.ui;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Марта on 17.03.2018.
 */
@Module
public abstract class NavigationModule {
    @Binds
    abstract ScreenNavigator provideScreenNavigator(DefaultScreenNavigator screenNavigator);

}
