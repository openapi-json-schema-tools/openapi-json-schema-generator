package org.openapijsonschematools.client.paths.userusername;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.userusername.put.PathParameters;
import org.openapijsonschematools.client.paths.userusername.put.RequestBody;
import org.openapijsonschematools.client.paths.userusername.put.Parameters;
import org.openapijsonschematools.client.paths.userusername.put.Responses;

public class Put {

    public static class PutRequest {
        public RequestBody.SealedRequestBody requestBody;
        public PathParameters.PathParametersMap pathParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;

        public PutRequest(
            RequestBody.SealedRequestBody requestBody,
            PathParameters.PathParametersMap pathParameters,
            RootServerInfo.@Nullable ServerIndex serverIndex
        ) {
            this.requestBody = requestBody;
            this.pathParameters = pathParameters;
            this.serverIndex = serverIndex;
        }
    }

    public static class PutNullableRequest {
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public PathParameters.@Nullable PathParametersMap pathParameters;
        public RequestBody.@Nullable SealedRequestBody requestBody;
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

    public interface SetterForPathParameters <T> {
        PutNullableRequest getInstance();
        T getBuilderAfterPathParameters(PutNullableRequest instance);
        default T pathParameters(PathParameters.PathParametersMap pathParameters) {
            var instance = getInstance();
            instance.pathParameters = pathParameters;
            return getBuilderAfterPathParameters(instance);
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

    public static class Put00RequestBuilder {
        private final PutNullableRequest instance;

        public Put00RequestBuilder(PutNullableRequest instance) {
            this.instance = instance;
        }

        public PutRequest build() {
            // todo casting code here
        }
    }
    public static class Put01RequestBuilder {
        private final PutNullableRequest instance;

        public Put01RequestBuilder(PutNullableRequest instance) {
            this.instance = instance;
        }
    }
    public static class PutRequestBuilder {
        private final PutNullableRequest instance;

        public PutRequestBuilder() {
            this.instance = new PutNullableRequest();
        }
    }
}
