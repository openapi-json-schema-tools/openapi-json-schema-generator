package org.openapijsonschematools.client.parameter;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;

import java.util.Map;

public interface NonQueryParameter {
    Map<String, String> serialize(@Nullable Object inData, boolean validate, SchemaConfiguration configuration);
}