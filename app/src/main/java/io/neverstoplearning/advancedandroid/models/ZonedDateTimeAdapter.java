package io.neverstoplearning.advancedandroid.models;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;

import org.threeten.bp.ZonedDateTime;

import javax.annotation.Nullable;

/**
 * Created by Марта on 20.03.2018.
 */

public class ZonedDateTimeAdapter {
    @FromJson
    ZonedDateTime fromJson(String json) {
        return ZonedDateTime.parse(json);
    }

    @ToJson
    String toJSon(@Nullable ZonedDateTime value) {
        return value != null ? value.toString() : null;
    }
}
