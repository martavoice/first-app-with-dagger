package io.neverstoplearning.advancedandroid.trending;

import dagger.Subcomponent;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import io.neverstoplearning.advancedandroid.di.ActivityInjector;
import io.neverstoplearning.advancedandroid.di.ScreenScope;

/**
 * Created by Марта on 16.03.2018.
 */
@ScreenScope
@Subcomponent
public interface TrendingReposComponent extends AndroidInjector<TrendingReposController> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TrendingReposController>{

    }
}
