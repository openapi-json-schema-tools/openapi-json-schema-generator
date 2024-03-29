package org.openapijsonschematools.client.response;

import java.net.http.HttpResponse;

public record DeserializedApiResponse<SealedBodyOutputClass, HeaderOutputClass>(HttpResponse<byte[]> response,
                                                                                SealedBodyOutputClass body,
                                                                                HeaderOutputClass headers) implements ApiResponse<SealedBodyOutputClass, HeaderOutputClass> {
}