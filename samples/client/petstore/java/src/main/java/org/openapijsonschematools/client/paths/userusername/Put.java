package org.openapijsonschematools.client.paths.userusername;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.userusername.put.PathParameters;
import org.openapijsonschematools.client.paths.userusername.put.RequestBody;
import org.openapijsonschematools.client.paths.userusername.put.RequestBody;
import org.openapijsonschematools.client.paths.userusername.put.PathParameters;
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
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public PathParameters.@Nullable PathParametersMap pathParameters;
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

    public interface SetterForPathParameters <T> {
        PutNullableRequest getInstance();
        T getBuilderAfterPathParameters(PutNullableRequest instance);
        default T pathParameters(PathParameters.PathParametersMap pathParameters) {
            var instance = getInstance();
            instance.pathParameters = pathParameters;
            return getBuilderAfterPathParameters(instance);
        }
    }

    public static class Put00RequestBuilder implements SetterForServerIndex<Put00RequestBuilder> {
        private final PutNullableRequest instance;

        public Put00RequestBuilder(PutNullableRequest instance) {
            this.instance = instance;
        }

        public PutRequest build() {
            var requestBody = instance.requestBody;
            if (requestBody == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            var pathParameters = instance.pathParameters;
            if (pathParameters == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new PutRequest(
                requestBody,
                pathParameters,
                instance.serverIndex
            );
        }

        public PutNullableRequest getInstance() {
            return instance;
        }

        public Put00RequestBuilder getBuilderAfterServerIndex(PutNullableRequest instance) {
            return this;
        }
    }
    public static class Put01RequestBuilder implements SetterForPathParameters<Put00RequestBuilder> {
        private final PutNullableRequest instance;

        public Put01RequestBuilder(PutNullableRequest instance) {
            this.instance = instance;
        }

        public PutNullableRequest getInstance() {
            return instance;
        }

        public Put00RequestBuilder getBuilderAfterPathParameters(PutNullableRequest instance) {
            return new Put00RequestBuilder(instance);
        }
    }
    public static class Put10RequestBuilder implements SetterForRequestBody<Put00RequestBuilder> {
        private final PutNullableRequest instance;

        public Put10RequestBuilder(PutNullableRequest instance) {
            this.instance = instance;
        }

        public PutNullableRequest getInstance() {
            return instance;
        }

        public Put00RequestBuilder getBuilderAfterRequestBody(PutNullableRequest instance) {
            return new Put00RequestBuilder(instance);
        }
    }
    public static class PutRequestBuilder implements SetterForRequestBody<Put01RequestBuilder>, SetterForPathParameters<Put10RequestBuilder> {
        private final PutNullableRequest instance;

        public PutRequestBuilder() {
            this.instance = new PutNullableRequest();
        }

        public PutNullableRequest getInstance() {
            return instance;
        }

        public Put01RequestBuilder getBuilderAfterRequestBody(PutNullableRequest instance) {
            return new Put01RequestBuilder(instance);
        }

        public Put10RequestBuilder getBuilderAfterPathParameters(PutNullableRequest instance) {
            return new Put10RequestBuilder(instance);
        }
    }
}
