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
        public @Nullable RootServerInfo.ServerIndex rootServerInfo;
        public @Nullable FakeDeleteSecurityInfo.SecurityIndex fakeDeleteSecurityInfo;
        public @Nullable QueryParameters.QueryParameters1 queryParameters;
        public @Nullable HeaderParameters.HeaderParameters1 headerParameters;
    }
}
