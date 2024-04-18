package unit_test_api.exceptions;

import java.net.http.HttpResponse;

@SuppressWarnings("serial")
public class ApiException extends BaseException {
    public HttpResponse<byte[]> response;

    public ApiException(String s, HttpResponse<byte[]> response) {
        super(s);
        this.response = response;
    }
}