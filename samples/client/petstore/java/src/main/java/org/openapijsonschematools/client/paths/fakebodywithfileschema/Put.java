package org.openapijsonschematools.client.paths.fakebodywithfileschema;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakebodywithfileschema.put.RequestBody;
import org.openapijsonschematools.client.paths.fakebodywithfileschema.put.Responses;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Put {

    public static class Put1 {
        private final ApiConfiguration apiConfiguration;

        public Put1(ApiConfiguration apiConfiguration) {
            this.apiConfiguration = apiConfiguration;
        }

        public Responses.EndpointResponse put(PutRequest request) {
            Map<String, List<String>> headers = apiConfiguration.getDefaultHeaders();
            SerializedRequestBody serializedRequestBody = new RequestBody.RequestBody1().serialize(
                request.requestBody
            );
            var contentTypeHeaderValues = headers.getOrDefault("Content-Type", new ArrayList<>());
            contentTypeHeaderValues.add(serializedRequestBody.contentType);
            // todo serialize all parameter types
        }
    }

    public static class PutRequest {
        public RequestBody.SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;

        public PutRequest(
            RequestBody.SealedRequestBody requestBody,
            RootServerInfo.@Nullable ServerIndex serverIndex
        ) {
            this.requestBody = requestBody;
            this.serverIndex = serverIndex;
        }
    }

    public static class PutNullableRequest {
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
    }

    public interface SetterForServerIndex <T> {
        PutNullableRequest getInstance();
        T getBuilderAfterServerIndex(PutNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForRequestBody <T> {
        PutNullableRequest getInstance();
        T getBuilderAfterRequestBody(PutNullableRequest instance);
        default T requestBody(RequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public static class Put0RequestBuilder implements SetterForServerIndex<Put0RequestBuilder> {
        private final PutNullableRequest instance;

        public Put0RequestBuilder(PutNullableRequest instance) {
            this.instance = instance;
        }

        public PutRequest build() {
            var requestBody = instance.requestBody;
            if (requestBody == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new PutRequest(
                requestBody,
                instance.serverIndex
            );
        }

        public PutNullableRequest getInstance() {
            return instance;
        }

        public Put0RequestBuilder getBuilderAfterServerIndex(PutNullableRequest instance) {
            return this;
        }
    }
    public static class PutRequestBuilder implements SetterForRequestBody<Put0RequestBuilder> {
        private final PutNullableRequest instance;

        public PutRequestBuilder() {
            this.instance = new PutNullableRequest();
        }

        public PutNullableRequest getInstance() {
            return instance;
        }

        public Put0RequestBuilder getBuilderAfterRequestBody(PutNullableRequest instance) {
            return new Put0RequestBuilder(instance);
        }
    }
}
