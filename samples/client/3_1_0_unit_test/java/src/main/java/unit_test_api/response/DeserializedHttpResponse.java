package unit_test_api.response;

import java.net.http.HttpResponse;

public record DeserializedHttpResponse<SealedBodyOutputClass, HeaderOutputClass>(SealedBodyOutputClass body, HeaderOutputClass headers) {
}