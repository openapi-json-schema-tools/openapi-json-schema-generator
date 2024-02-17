package org.openapijsonschematools.client.response;

import java.net.http.HttpResponse;

public class ApiResponse<SealedBodyOutputClass, HeaderOutputClass> {
    public final HttpResponse<byte[]> response;
    public final SealedBodyOutputClass body;
    public final HeaderOutputClass headers;

    public ApiResponse(HttpResponse<byte[]> response, SealedBodyOutputClass body, HeaderOutputClass headers) {
        this.response = response;
        this.body = body;
        this.headers = headers;
    }
}