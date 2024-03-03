package org.openapijsonschematools.client.parameter;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;

public interface QueryParameter {
    Map<String, String> serialize(@Nullable Object inData, boolean validate, SchemaConfiguration configuration, PrefixSeparatorIterator iterator);
    PrefixSeparatorIterator iterator getPrefixSeparatorIterator();
}