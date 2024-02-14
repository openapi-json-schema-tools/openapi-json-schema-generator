package org.openapijsonschematools.client.requestbody;

import java.net.http.HttpRequest;

public class SerializedRequestBody {
    public final String contentType;
    public final HttpRequest.BodyPublisher bodyPublisher;

    protected SerializedRequestBody(String contentType, HttpRequest.BodyPublisher bodyPublisher) {
        this.contentType = contentType;
        this.bodyPublisher = bodyPublisher;
    }
}