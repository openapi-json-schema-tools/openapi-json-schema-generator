package org.openapijsonschematools.client.paths.fakeobjinquery;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.fakeobjinquery.get.QueryParameters;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakeobjinquery.get.Parameters;
import org.openapijsonschematools.client.paths.fakeobjinquery.get.Responses;

public class Get {
    public static class GetCallData {
        public @Nullable QueryParameters.QueryParameters1 queryParameters;
        public @Nullable RootServerInfo.ServerIndex rootServerInfo;
    }
}
