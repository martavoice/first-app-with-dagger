package io.neverstoplearning.advancedandroid.ui;

import com.bluelinelabs.conductor.Controller;
import com.bluelinelabs.conductor.Router;

/**
 * Created by Марта on 17.03.2018.
 */

public interface ScreenNavigator {
    void initWithRouter(Router router, Controller rootScreen);

    boolean pop();

    void clear();
}
