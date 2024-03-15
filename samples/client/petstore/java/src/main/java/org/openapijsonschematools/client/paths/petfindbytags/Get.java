package org.openapijsonschematools.client.paths.petfindbytags;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.petfindbytags.get.PetfindbytagsGetSecurityInfo;
import org.openapijsonschematools.client.paths.petfindbytags.get.QueryParameters;
import org.openapijsonschematools.client.paths.petfindbytags.get.Parameters;
import org.openapijsonschematools.client.paths.petfindbytags.get.Responses;

public class Get {
    public static class GetCallData {
        public @Nullable RootServerInfo.ServerIndex serverIndex;
        public @Nullable PetfindbytagsGetSecurityInfo.SecurityIndex securityIndex;
        public @Nullable QueryParameters.QueryParameters1 queryParameters;
    }
}
