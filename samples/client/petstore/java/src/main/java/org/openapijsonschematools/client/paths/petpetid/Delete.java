package org.openapijsonschematools.client.paths.petpetid;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.petpetid.delete.HeaderParameters;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.petpetid.delete.PetpetidDeleteSecurityInfo;
import org.openapijsonschematools.client.paths.petpetid.delete.PathParameters;
import org.openapijsonschematools.client.paths.petpetid.delete.Parameters;
import org.openapijsonschematools.client.paths.petpetid.delete.Responses;

public class Delete {
    public static class DeleteCallData {
        public @Nullable HeaderParameters.HeaderParameters1 headerParameters;
        public @Nullable RootServerInfo.ServerIndex serverIndex;
        public @Nullable PetpetidDeleteSecurityInfo.SecurityIndex securityIndex;
        public @Nullable PathParameters.PathParameters1 pathParameters;
    }
}
