package org.openapijsonschematools.client.paths.petfindbystatus;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.petfindbystatus.PetfindbystatusServerInfo;
import org.openapijsonschematools.client.paths.petfindbystatus.get.PetfindbystatusGetSecurityInfo;
import org.openapijsonschematools.client.paths.petfindbystatus.get.QueryParameters;
import org.openapijsonschematools.client.paths.petfindbystatus.get.Parameters;
import org.openapijsonschematools.client.paths.petfindbystatus.get.Responses;

public class Get {
    public static class GetCallData {
        public @Nullable PetfindbystatusServerInfo.ServerIndex serverIndex;
        public @Nullable PetfindbystatusGetSecurityInfo.SecurityIndex securityIndex;
        public @Nullable QueryParameters.QueryParameters1 queryParameters;
    }
}
