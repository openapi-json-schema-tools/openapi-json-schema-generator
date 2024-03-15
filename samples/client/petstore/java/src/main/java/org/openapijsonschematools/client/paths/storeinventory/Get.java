package org.openapijsonschematools.client.paths.storeinventory;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.storeinventory.get.StoreinventoryGetSecurityInfo;
import org.openapijsonschematools.client.paths.storeinventory.get.Responses;

public class Get {

    public static class GetRequest {
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public StoreinventoryGetSecurityInfo.@Nullable SecurityIndex securityIndex;
    }

    public interface SetterForServerIndex <T> {
        GetRequest getInstance();
        T getBuilderAfterServerIndex(GetRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForSecurityIndex <T> {
        GetRequest getInstance();
        T getBuilderAfterSecurityIndex(GetRequest instance);
        default T securityIndex(StoreinventoryGetSecurityInfo.SecurityIndex securityIndex) {
            var instance = getInstance();
            instance.securityIndex = securityIndex;
            return getBuilderAfterSecurityIndex(instance);
        }
    }

    public static class GetRequestBuilder {
        private final GetRequest instance;

        public GetRequestBuilder() {
            this.instance = new GetRequest();
        }

        public GetRequest build() {
            return instance;
        }
    }
}
