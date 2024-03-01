package org.openapijsonschematools.client.contenttype;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.ToNumberPolicy;
import org.checkerframework.checker.nullness.qual.Nullable;

public class ContentTypeDeserializer {
    private static final Gson gson = new GsonBuilder()
            .setObjectToNumberStrategy(ToNumberPolicy.LONG_OR_DOUBLE)
            .setNumberToNumberStrategy(ToNumberPolicy.LONG_OR_DOUBLE)
            .create();

    @SuppressWarnings("nullness")
    public static @Nullable Object fromJson(String json) {
        return gson.fromJson(json, Object.class);
    }
}
