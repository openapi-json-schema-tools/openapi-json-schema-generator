package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Map;

public class FrozenMapOfAnything extends FrozenMap<@Nullable Object> {
    public FrozenMapOfAnything(Map<String, ? extends @Nullable Object> m) {
        super(m);
    }
}
