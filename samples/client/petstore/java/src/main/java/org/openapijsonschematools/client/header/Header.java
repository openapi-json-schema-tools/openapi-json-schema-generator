package org.openapijsonschematools.client.header;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;

import java.net.http.HttpHeaders;

public interface Header {
    HttpHeaders serialize(@Nullable Object inData, String name, boolean skipValidation, SchemaConfiguration configuration);
}