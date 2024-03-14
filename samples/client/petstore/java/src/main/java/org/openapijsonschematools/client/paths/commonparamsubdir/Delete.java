package org.openapijsonschematools.client.paths.commonparamsubdir;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.commonparamsubdir.delete.HeaderParameters;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.commonparamsubdir.delete.PathParameters;
import org.openapijsonschematools.client.paths.commonparamsubdir.delete.Parameters;
import org.openapijsonschematools.client.paths.commonparamsubdir.delete.Responses;

public class Delete {
    public static class DeleteCallData {
        public @Nullable HeaderParameters.HeaderParameters1 headerParameters;
        public @Nullable RootServerInfo.ServerIndex rootServerInfo;
        public @Nullable PathParameters.PathParameters1 pathParameters;
    }
}
