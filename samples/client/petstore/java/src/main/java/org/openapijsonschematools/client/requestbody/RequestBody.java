package org.openapijsonschematools.client.requestbody;

public interface RequestBody<SealedSchemaOutputClass> {
    String contentType();
    SealedSchemaOutputClass body();
}