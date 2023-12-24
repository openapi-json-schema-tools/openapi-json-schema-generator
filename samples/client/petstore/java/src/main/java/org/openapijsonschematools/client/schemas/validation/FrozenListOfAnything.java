package org.openapijsonschematools.client.schemas.validation;

import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Collection;

public class FrozenListOfAnything extends FrozenList<@Nullable Object> {
    public FrozenListOfAnything(Collection<? extends @Nullable Object> m) {
        super(m);
    }
}

