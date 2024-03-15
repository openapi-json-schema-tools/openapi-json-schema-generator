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
        public @Nullable RootServerInfo.ServerIndex serverIndex;
        public @Nullable FakeDeleteSecurityInfo.SecurityIndex securityIndex;
        public @Nullable QueryParameters.QueryParameters1 queryParameters;
        public @Nullable HeaderParameters.HeaderParameters1 headerParameters;
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
