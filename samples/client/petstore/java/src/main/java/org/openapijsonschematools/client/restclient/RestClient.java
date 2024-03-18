package org.openapijsonschematools.client.restclient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class RestClient {
    public static HttpRequest getRequest(
        String serviceUrl,
        String method,
        HttpRequest.BodyPublisher bodyPublisher,
        Map<String, List<String>> headers
    ) {
        HttpRequest.Builder request = HttpRequest.newBuilder(URI.create(serviceUrl));
        switch (method) {
            case "get":
                request.GET();
                break;
            case "put":
                request.method("PUT", bodyPublisher);
                break;
            case "patch":
                request.method("PATCH", bodyPublisher);
                break;
            case "post":
                request.method("POST", bodyPublisher);
                break;
            case "delete":
                request.DELETE();
                break;
            case "trace":
                request.method("TRACE", bodyPublisher);
                break;
            case "options":
                request.method("OPTIONS", bodyPublisher);
                break;
            case "head":
                request.method("HEAD", bodyPublisher);
                break;
            case "connect":
                request.method("CONNECT", bodyPublisher);
                break;
            default:
                throw new RuntimeException("Invalid http method");
        }
        for (Map.Entry<String, List<String>> entry: headers.entrySet()) {
            String headerName = entry.getKey();
            String headerValue = String.join(", ", entry.getValue());
            request.header(headerName, headerValue);
        }
        return request.build();
    }

    public static HttpResponse<byte[]> getResponse(HttpRequest request, HttpClient client) throws IOException, InterruptedException {
        return client.send(request, HttpResponse.BodyHandlers.ofByteArray());
    }
}
