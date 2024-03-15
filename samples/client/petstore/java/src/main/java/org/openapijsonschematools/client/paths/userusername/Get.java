package org.openapijsonschematools.client.paths.userusername;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.userusername.get.PathParameters;
import org.openapijsonschematools.client.paths.userusername.get.Parameters;
import org.openapijsonschematools.client.paths.userusername.get.Responses;

public class Get {
    public static class GetCallData {
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public PathParameters.@Nullable PathParameters1 pathParameters;
    }

    public interface SetterForServerIndex <T> {
        GetCallData getInstance();
        T getBuilderAfterServerIndex(GetCallData instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForPathParameters <T> {
        GetCallData getInstance();
        T getBuilderAfterPathParameters(GetCallData instance);
        default T pathParameters(PathParameters.PathParameters1 pathParameters) {
            var instance = getInstance();
            instance.pathParameters = pathParameters;
            return getBuilderAfterPathParameters(instance);
        }
    }

    public static class Get0RequestBuilder {
        private final GetCallData instance;

        public Get0RequestBuilderGetCallData instance) {
            this.instance = instance;
        }
    }
    public static class GetRequestBuilder {
        private final GetCallData instance;

        public GetRequestBuilder() {
            this.instance = new GetCallData();
        }
    }
}
