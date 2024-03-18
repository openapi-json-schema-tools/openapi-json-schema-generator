package org.openapijsonschematools.client.paths.storeinventory;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.storeinventory.get.StoreinventoryGetSecurityInfo;
import org.openapijsonschematools.client.paths.storeinventory.get.Responses;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.paths.Storeinventory;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Get {

    public static class Get1 extends Storeinventory {
        private final ApiConfiguration apiConfiguration;

        public Get1(ApiConfiguration apiConfiguration) {
            this.apiConfiguration = apiConfiguration;
        }

        public Responses.EndpointResponse get(GetRequest request) {
            Map<String, List<String>> headers = apiConfiguration.getDefaultHeaders();
            String host = apiConfiguration.getServer(request.serverIndex).url();
            SecurityRequirementObject securityRequirementObject = apiConfiguration.getSecurityRequirementObject(securityIndex);
        }
    }

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

    public static class GetRequestBuilder implements SetterForServerIndex<GetRequestBuilder>, SetterForSecurityIndex<GetRequestBuilder> {
        private final GetRequest instance;

        public GetRequestBuilder() {
            this.instance = new GetRequest();
        }

        public GetRequest build() {
            return instance;
        }

        public GetRequest getInstance() {
            return instance;
        }

        public GetRequestBuilder getBuilderAfterServerIndex(GetRequest instance) {
            return this;
        }

        public GetRequestBuilder getBuilderAfterSecurityIndex(GetRequest instance) {
            return this;
        }
    }
}
