package org.openapijsonschematools.client.response;

import java.net.http.HttpResponse;

public record DeserializedHttpResponse<SealedBodyOutputClass, HeaderOutputClass>(SealedBodyOutputClass body, HeaderOutputClass headers) {
}