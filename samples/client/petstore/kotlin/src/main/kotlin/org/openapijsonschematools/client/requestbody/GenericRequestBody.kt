package org.openapijsonschematools.client.requestbody;

public interface GenericRequestBody<SealedSchemaOutputClass> {
    String contentType();
    SealedSchemaOutputClass body();
}