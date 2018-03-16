package io.neverstoplearning.advancedandroid.di;

import android.app.Activity;

import com.bluelinelabs.conductor.Controller;

import io.neverstoplearning.advancedandroid.base.BaseActivity;

/**
 * Created by Марта on 16.03.2018.
 */

public class Injector {
    private Injector() {
    }

    public static void inject(Activity activity) {
        ActivityInjector.get(activity).inject(activity);
    }

    public static void clearComponent(Activity activity) {
        ActivityInjector.get(activity).inject(activity);
    }

    public static void inject(Controller controller) {
        ScreenInjector.get(controller.getActivity()).inject(controller);
    }

    public static void clearComponent(Controller controller) {
        ScreenInjector.get(controller.getActivity()).clear(controller);
    }
}
