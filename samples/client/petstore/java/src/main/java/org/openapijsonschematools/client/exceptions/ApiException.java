package org.openapijsonschematools.client.exceptions;

import java.net.http.HttpResponse;
import org.openapijsonschematools.client.response.ApiResponse;

@SuppressWarnings("serial")
public class ApiException extends BaseException {
    public HttpResponse<byte[]> response;

    public ValidationException(String s, HttpResponse<byte[]> response) {
        super(s);
        this.response = response;
    }
}