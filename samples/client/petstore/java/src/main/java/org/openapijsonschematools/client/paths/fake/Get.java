package org.openapijsonschematools.client.paths.fake;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.fake.get.RequestBody;
import org.openapijsonschematools.client.paths.fake.get.HeaderParameters;
import org.openapijsonschematools.client.paths.fake.get.QueryParameters;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fake.get.Parameters;
import org.openapijsonschematools.client.paths.fake.get.Responses;

public class Get {
    public static class GetCallData {
        public @Nullable RequestBody.SealedRequestBody requestBody;
        public @Nullable HeaderParameters.HeaderParameters1 headerParameters;
        public @Nullable QueryParameters.QueryParameters1 queryParameters;
        public @Nullable RootServerInfo.ServerIndex serverIndex;
    }
}
