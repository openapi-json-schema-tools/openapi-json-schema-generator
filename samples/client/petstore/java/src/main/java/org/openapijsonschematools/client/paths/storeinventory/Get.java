package org.openapijsonschematools.client.paths.storeinventory;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.storeinventory.get.StoreinventoryGetSecurityInfo;
import org.openapijsonschematools.client.paths.storeinventory.get.Responses;

public class Get {
    public static class GetCallData {
        public @Nullable RootServerInfo.ServerIndex serverIndex;
        public @Nullable StoreinventoryGetSecurityInfo.SecurityIndex securityIndex;
    }

    public static class GetRequestBuilder {
        private final GetCallData instance;

        public GetRequestBuilder() {
            this.instance = new GetCallData();
        }
    }
}
