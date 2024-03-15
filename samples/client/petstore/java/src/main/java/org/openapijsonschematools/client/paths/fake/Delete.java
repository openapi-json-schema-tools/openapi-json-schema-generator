package org.openapijsonschematools.client.paths.fake;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fake.delete.FakeDeleteSecurityInfo;
import org.openapijsonschematools.client.paths.fake.delete.QueryParameters;
import org.openapijsonschematools.client.paths.fake.delete.HeaderParameters;
import org.openapijsonschematools.client.paths.fake.delete.Parameters;
import org.openapijsonschematools.client.paths.fake.delete.Responses;

public class Delete {
    public static class DeleteCallData {
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public FakeDeleteSecurityInfo.@Nullable SecurityIndex securityIndex;
        public QueryParameters.@Nullable QueryParameters1 queryParameters;
        public HeaderParameters.@Nullable HeaderParameters1 headerParameters;
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

    public interface SetterForSecurityIndex <T> {
        DeleteCallData getInstance();
        T getBuilderAfterSecurityIndex(DeleteCallData instance);
        default T securityIndex(FakeDeleteSecurityInfo.SecurityIndex securityIndex) {
            var instance = getInstance();
            instance.securityIndex = securityIndex;
            return getBuilderAfterSecurityIndex(instance);
        }
    }

    public interface SetterForQueryParameters <T> {
        DeleteCallData getInstance();
        T getBuilderAfterQueryParameters(DeleteCallData instance);
        default T queryParameters(QueryParameters.QueryParameters1 queryParameters) {
            var instance = getInstance();
            instance.queryParameters = queryParameters;
            return getBuilderAfterQueryParameters(instance);
        }
    }

    public interface SetterForHeaderParameters <T> {
        DeleteCallData getInstance();
        T getBuilderAfterHeaderParameters(DeleteCallData instance);
        default T headerParameters(HeaderParameters.HeaderParameters1 headerParameters) {
            var instance = getInstance();
            instance.headerParameters = headerParameters;
            return getBuilderAfterHeaderParameters(instance);
        }
    }

    public static class Delete00RequestBuilder {
        private final DeleteCallData instance;

        public Delete00RequestBuilderDeleteCallData instance) {
            this.instance = instance;
        }
    }
    public static class Delete01RequestBuilder {
        private final DeleteCallData instance;

        public Delete01RequestBuilderDeleteCallData instance) {
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
