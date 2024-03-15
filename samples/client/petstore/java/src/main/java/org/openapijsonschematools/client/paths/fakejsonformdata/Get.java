package org.openapijsonschematools.client.paths.fakejsonformdata;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.fakejsonformdata.get.RequestBody;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakejsonformdata.get.Responses;

public class Get {

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
