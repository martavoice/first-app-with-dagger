package io.neverstoplearning.advancedandroid.data;

import com.google.auto.value.AutoValue;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.util.List;

import io.neverstoplearning.advancedandroid.models.Repo;

/**
 * Created by Марта on 20.03.2018.
 */
@AutoValue
public abstract class TrendingReposResponse {
    @Json(name = "items")
    public abstract List<Repo> repos();

    public static JsonAdapter<TrendingReposResponse> jsonAdapter(Moshi moshi){
        return new AutoValue_TrendingReposResponse.MoshiJsonAdapter(moshi);
    }
}
