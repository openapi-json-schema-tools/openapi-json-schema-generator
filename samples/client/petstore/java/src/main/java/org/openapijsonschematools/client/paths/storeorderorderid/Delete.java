package org.openapijsonschematools.client.paths.storeorderorderid;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.storeorderorderid.delete.PathParameters;
import org.openapijsonschematools.client.paths.storeorderorderid.delete.Parameters;
import org.openapijsonschematools.client.paths.storeorderorderid.delete.Responses;

public class Delete {
    public static class DeleteCallData {
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public PathParameters.@Nullable PathParameters1 pathParameters;
    }

    public interface SetterForServerIndex <T> {
        DeleteCallData getInstance();
        T getBuilderAfterServerIndex(DeleteCallData instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForPathParameters <T> {
        DeleteCallData getInstance();
        T getBuilderAfterPathParameters(DeleteCallData instance);
        default T pathParameters(PathParameters.PathParameters1 pathParameters) {
            var instance = getInstance();
            instance.pathParameters = pathParameters;
            return getBuilderAfterPathParameters(instance);
        }
    }

    public static class Delete0RequestBuilder {
        private final DeleteCallData instance;

        public Delete0RequestBuilderDeleteCallData instance) {
            this.instance = instance;
        }
    }
    public static class DeleteRequestBuilder {
        private final DeleteCallData instance;

        public DeleteRequestBuilder() {
            this.instance = new DeleteCallData();
        }
    }
}
