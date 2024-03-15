package org.openapijsonschematools.client.paths.userlogin;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.userlogin.get.QueryParameters;
import org.openapijsonschematools.client.paths.userlogin.get.Parameters;
import org.openapijsonschematools.client.paths.userlogin.get.Responses;

public class Get {
    public static class GetCallData {
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public QueryParameters.@Nullable QueryParameters1 queryParameters;
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

    public interface SetterForQueryParameters <T> {
        GetCallData getInstance();
        T getBuilderAfterQueryParameters(GetCallData instance);
        default T queryParameters(QueryParameters.QueryParameters1 queryParameters) {
            var instance = getInstance();
            instance.queryParameters = queryParameters;
            return getBuilderAfterQueryParameters(instance);
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
