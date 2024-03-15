package org.openapijsonschematools.client.paths.fakeobjinquery;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.fakeobjinquery.get.QueryParameters;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakeobjinquery.get.Parameters;
import org.openapijsonschematools.client.paths.fakeobjinquery.get.Responses;

public class Get {

    public static class GetRequest {
        public QueryParameters.@Nullable QueryParametersMap queryParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
    }

    public interface SetterForQueryParameters <T> {
        GetRequest getInstance();
        T getBuilderAfterQueryParameters(GetRequest instance);
        default T queryParameters(QueryParameters.QueryParametersMap queryParameters) {
            var instance = getInstance();
            instance.queryParameters = queryParameters;
            return getBuilderAfterQueryParameters(instance);
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

    public static class GetRequestBuilder {
        private final GetRequest instance;

        public GetRequestBuilder() {
            this.instance = new GetRequest();
        }

        public GetRequest build() {
            return instance;
        }
    }
}
