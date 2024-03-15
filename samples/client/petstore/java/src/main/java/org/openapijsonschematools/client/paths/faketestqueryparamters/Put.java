package org.openapijsonschematools.client.paths.faketestqueryparamters;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.QueryParameters;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.Parameters;
import org.openapijsonschematools.client.paths.faketestqueryparamters.put.Responses;

public class Put {
    public static class PutCallData {
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public QueryParameters.@Nullable QueryParameters1 queryParameters;
    }

    public interface SetterForServerIndex <T> {
        PutCallData getInstance();
        T getBuilderAfterServerIndex(PutCallData instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForQueryParameters <T> {
        PutCallData getInstance();
        T getBuilderAfterQueryParameters(PutCallData instance);
        default T queryParameters(QueryParameters.QueryParameters1 queryParameters) {
            var instance = getInstance();
            instance.queryParameters = queryParameters;
            return getBuilderAfterQueryParameters(instance);
        }
    }

    public static class Put0RequestBuilder {
        private final PutCallData instance;

        public Put0RequestBuilderPutCallData instance) {
            this.instance = instance;
        }
    }
    public static class PutRequestBuilder {
        private final PutCallData instance;

        public PutRequestBuilder() {
            this.instance = new PutCallData();
        }
    }
}
