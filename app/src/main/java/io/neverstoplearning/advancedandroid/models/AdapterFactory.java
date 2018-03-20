package io.neverstoplearning.advancedandroid.models;

import com.ryanharter.auto.value.moshi.MoshiAdapterFactory;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;

import javax.annotation.Nullable;

/**
 * Created by Марта on 20.03.2018.
 */
@MoshiAdapterFactory
public abstract class AdapterFactory implements JsonAdapter.Factory {
public static JsonAdapter.Factory create(){
    return new AutoValueMoshi_AdapterFactory();
}
}
