package org.openapijsonschematools.client.paths.petpetid;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.petpetid.get.PetpetidGetSecurityInfo;
import org.openapijsonschematools.client.paths.petpetid.get.PathParameters;
import org.openapijsonschematools.client.paths.petpetid.get.Parameters;
import org.openapijsonschematools.client.paths.petpetid.get.Responses;

public class Get {
    public static class GetCallData {
        public @Nullable RootServerInfo.ServerIndex serverIndex;
        public @Nullable PetpetidGetSecurityInfo.SecurityIndex securityIndex;
        public @Nullable PathParameters.PathParameters1 pathParameters;
    }
}
