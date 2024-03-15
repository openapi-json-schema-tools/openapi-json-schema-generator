package org.openapijsonschematools.client.paths.storeorderorderid;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.storeorderorderid.get.PathParameters;
import org.openapijsonschematools.client.paths.storeorderorderid.get.Parameters;
import org.openapijsonschematools.client.paths.storeorderorderid.get.Responses;

public class Get {

    public static class GetRequest {
        public PathParameters.PathParametersMap pathParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;

        public GetRequest(
            PathParameters.PathParametersMap pathParameters,
            RootServerInfo.@Nullable ServerIndex serverIndex
        ) {
            this.pathParameters = pathParameters;
            this.serverIndex = serverIndex;
        }
    }

    public static class GetNullableRequest {
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public PathParameters.@Nullable PathParametersMap pathParameters;
    }

    public interface SetterForServerIndex <T> {
        GetNullableRequest getInstance();
        T getBuilderAfterServerIndex(GetNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForPathParameters <T> {
        GetNullableRequest getInstance();
        T getBuilderAfterPathParameters(GetNullableRequest instance);
        default T pathParameters(PathParameters.PathParametersMap pathParameters) {
            var instance = getInstance();
            instance.pathParameters = pathParameters;
            return getBuilderAfterPathParameters(instance);
        }
    }

    public static class Get0RequestBuilder {
        private final GetNullableRequest instance;

        public Get0RequestBuilder(GetNullableRequest instance) {
            this.instance = instance;
        }

        public GetRequest build() {
            // todo casting code here
        }
    }
    public static class GetRequestBuilder {
        private final GetNullableRequest instance;

        public GetRequestBuilder() {
            this.instance = new GetNullableRequest();
        }
    }
}
