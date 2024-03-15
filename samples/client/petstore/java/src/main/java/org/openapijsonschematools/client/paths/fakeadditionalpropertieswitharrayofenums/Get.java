package org.openapijsonschematools.client.paths.fakeadditionalpropertieswitharrayofenums;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.fakeadditionalpropertieswitharrayofenums.get.RequestBody;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakeadditionalpropertieswitharrayofenums.get.Responses;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Get {

    public static class Get1 {
        private final ApiConfiguration apiConfiguration;

        public Get1(ApiConfiguration apiConfiguration) {
            this.apiConfiguration = apiConfiguration;
        }

        public Responses.EndpointResponse get(GetRequest request) {
            Map<String, List<String>> headers = apiConfiguration.getDefaultHeaders();
            @Nullable SerializedRequestBody serializedRequestBody;
            if (request.requestBody != null) {
                serializedRequestBody = new RequestBody.RequestBody1().serialize(
                    request.requestBody
                );
                var contentTypeHeaderValues = headers.getOrDefault("Content-Type", new ArrayList<>());
                contentTypeHeaderValues.add(serializedRequestBody.contentType);
            }
            // todo serialize all parameter types
        }
    }

    public static class GetRequest {
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
    }

    public interface SetterForRequestBody <T> {
        GetRequest getInstance();
        T getBuilderAfterRequestBody(GetRequest instance);
        default T requestBody(RequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public interface SetterForServerIndex <T> {
        GetRequest getInstance();
        T getBuilderAfterServerIndex(GetRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public static class GetRequestBuilder implements SetterForRequestBody<GetRequestBuilder>, SetterForServerIndex<GetRequestBuilder> {
        private final GetRequest instance;

        public GetRequestBuilder() {
            this.instance = new GetRequest();
        }

        public GetRequest build() {
            return instance;
        }

        public GetRequest getInstance() {
            return instance;
        }

        public GetRequestBuilder getBuilderAfterRequestBody(GetRequest instance) {
            return this;
        }

        public GetRequestBuilder getBuilderAfterServerIndex(GetRequest instance) {
            return this;
        }
    }
}
