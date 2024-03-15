package org.openapijsonschematools.client.paths.storeorderorderid;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.storeorderorderid.delete.PathParameters;
import org.openapijsonschematools.client.paths.storeorderorderid.delete.Parameters;
import org.openapijsonschematools.client.paths.storeorderorderid.delete.Responses;

public class Delete {

    public static class DeleteRequest {
        public PathParameters.PathParametersMap pathParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;

        public DeleteRequest(
            PathParameters.PathParametersMap pathParameters,
            RootServerInfo.@Nullable ServerIndex serverIndex
        ) {
            this.pathParameters = pathParameters;
            this.serverIndex = serverIndex;
        }
    }

    public static class DeleteNullableRequest {
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public PathParameters.@Nullable PathParametersMap pathParameters;
    }

    public interface SetterForServerIndex <T> {
        DeleteNullableRequest getInstance();
        T getBuilderAfterServerIndex(DeleteNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForPathParameters <T> {
        DeleteNullableRequest getInstance();
        T getBuilderAfterPathParameters(DeleteNullableRequest instance);
        default T pathParameters(PathParameters.PathParametersMap pathParameters) {
            var instance = getInstance();
            instance.pathParameters = pathParameters;
            return getBuilderAfterPathParameters(instance);
        }
    }

    public static class Delete0RequestBuilder {
        private final DeleteNullableRequest instance;

        public Delete0RequestBuilder(DeleteNullableRequest instance) {
            this.instance = instance;
        }

        public DeleteRequest build() {
            // todo casting code here
        }
    }
    public static class DeleteRequestBuilder {
        private final DeleteNullableRequest instance;

        public DeleteRequestBuilder() {
            this.instance = new DeleteNullableRequest();
        }
    }
}
