package org.openapijsonschematools.client.requestbody;

public interface ApiResponse<HeaderOutputClass, SealedBodyOutputClass> {
    HeaderOutputClass headers();
    SealedBodyOutputClass body();
}