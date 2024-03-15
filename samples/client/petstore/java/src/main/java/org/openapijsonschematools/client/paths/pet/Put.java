package org.openapijsonschematools.client.paths.pet;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.pet.put.PetPutSecurityInfo;
import org.openapijsonschematools.client.paths.pet.put.RequestBody;
import org.openapijsonschematools.client.paths.pet.put.Responses;

public class Put {
    public static class PutCallData {
        public @Nullable RootServerInfo.ServerIndex serverIndex;
        public @Nullable PetPutSecurityInfo.SecurityIndex securityIndex;
        public @Nullable RequestBody.SealedRequestBody requestBody;
    }

    public static class Put0RequestBuilder {
        private final PutCallData instance;

        public Put0RequestBuilderPutCallData instance) {
            this.instance = instance;
        }
    }
    public static class PutRequestBuilder {
        private final PutCallData instance;

        public PutRequestBuilder() {
            this.instance = new PutCallData();
        }
    }
}
