package org.openapijsonschematools.client.paths.userusername;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.userusername.delete.PathParameters;
import org.openapijsonschematools.client.paths.userusername.delete.Parameters;
import org.openapijsonschematools.client.paths.userusername.delete.Responses;

public class Delete {
    public static class DeleteCallData {
        public @Nullable RootServerInfo.ServerIndex rootServerInfo;
        public @Nullable PathParameters.PathParameters1 pathParameters;
    }
}
