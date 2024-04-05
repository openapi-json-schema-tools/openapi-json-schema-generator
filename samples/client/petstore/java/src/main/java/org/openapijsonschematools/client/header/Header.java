package org.openapijsonschematools.client.header;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.exceptions.ValidationException;

import java.net.http.HttpHeaders;
import java.util.List;

public interface Header {
    HttpHeaders serialize(@Nullable Object inData, String name, boolean validate, SchemaConfiguration configuration) throws NotImplementedException, ValidationException;
    @Nullable Object deserialize(List<String> inData, boolean validate, SchemaConfiguration configuration) throws NotImplementedException, ValidationException;
}