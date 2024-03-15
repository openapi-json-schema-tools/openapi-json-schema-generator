package org.openapijsonschematools.client.paths.petfindbystatus;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.petfindbystatus.PetfindbystatusServerInfo;
import org.openapijsonschematools.client.paths.petfindbystatus.get.PetfindbystatusGetSecurityInfo;
import org.openapijsonschematools.client.paths.petfindbystatus.get.QueryParameters;
import org.openapijsonschematools.client.paths.petfindbystatus.get.Parameters;
import org.openapijsonschematools.client.paths.petfindbystatus.get.Responses;

public class Get {

    public static class GetRequest {
        public QueryParameters.QueryParametersMap queryParameters;
        public PetfindbystatusServerInfo.@Nullable ServerIndex serverIndex;
        public PetfindbystatusGetSecurityInfo.@Nullable SecurityIndex securityIndex;

        public GetRequest(
            QueryParameters.QueryParametersMap queryParameters,
            PetfindbystatusServerInfo.@Nullable ServerIndex serverIndex,
            PetfindbystatusGetSecurityInfo.@Nullable SecurityIndex securityIndex
        ) {
            this.queryParameters = queryParameters;
            this.serverIndex = serverIndex;
            this.securityIndex = securityIndex;
        }
    }

    public static class GetNullableRequest {
        public QueryParameters.@Nullable QueryParametersMap queryParameters;
        public PetfindbystatusServerInfo.@Nullable ServerIndex serverIndex;
        public PetfindbystatusGetSecurityInfo.@Nullable SecurityIndex securityIndex;
    }

    public interface SetterForServerIndex <T> {
        GetNullableRequest getInstance();
        T getBuilderAfterServerIndex(GetNullableRequest instance);
        default T serverIndex(PetfindbystatusServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForSecurityIndex <T> {
        GetNullableRequest getInstance();
        T getBuilderAfterSecurityIndex(GetNullableRequest instance);
        default T securityIndex(PetfindbystatusGetSecurityInfo.SecurityIndex securityIndex) {
            var instance = getInstance();
            instance.securityIndex = securityIndex;
            return getBuilderAfterSecurityIndex(instance);
        }
    }

    public interface SetterForQueryParameters <T> {
        GetNullableRequest getInstance();
        T getBuilderAfterQueryParameters(GetNullableRequest instance);
        default T queryParameters(QueryParameters.QueryParametersMap queryParameters) {
            var instance = getInstance();
            instance.queryParameters = queryParameters;
            return getBuilderAfterQueryParameters(instance);
        }
    }

    public static class Get0RequestBuilder implements SetterForServerIndex<Get0RequestBuilder>, SetterForSecurityIndex<Get0RequestBuilder> {
        private final GetNullableRequest instance;

        public Get0RequestBuilder(GetNullableRequest instance) {
            this.instance = instance;
        }

        public GetRequest build() {
            var queryParameters = instance.queryParameters;
            if (queryParameters == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new GetRequest(
                queryParameters,
                instance.serverIndex,
                instance.securityIndex
            );
        }

        public GetNullableRequest getInstance() {
            return instance;
        }

        public Get0RequestBuilder getBuilderAfterServerIndex(GetNullableRequest instance) {
            return this;
        }

        public Get0RequestBuilder getBuilderAfterSecurityIndex(GetNullableRequest instance) {
            return this;
        }
    }
    public static class GetRequestBuilder implements SetterForQueryParameters<Get0RequestBuilder> {
        private final GetNullableRequest instance;

        public GetRequestBuilder() {
            this.instance = new GetNullableRequest();
        }

        public GetNullableRequest getInstance() {
            return instance;
        }

        public Get0RequestBuilder getBuilderAfterQueryParameters(GetNullableRequest instance) {
            return new Get0RequestBuilder(instance);
        }
    }
}
