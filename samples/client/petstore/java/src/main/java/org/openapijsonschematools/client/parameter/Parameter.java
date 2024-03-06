package org.openapijsonschematools.client.parameter;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;

import java.util.AbstractMap;

public interface Parameter {
    AbstractMap.SimpleEntry<String, String> serialize(@Nullable Object inData);
}