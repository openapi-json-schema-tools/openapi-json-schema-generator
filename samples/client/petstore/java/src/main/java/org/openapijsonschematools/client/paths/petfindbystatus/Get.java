package org.openapijsonschematools.client.paths.petfindbystatus;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.petfindbystatus.PetfindbystatusServerInfo;
import org.openapijsonschematools.client.paths.petfindbystatus.get.PetfindbystatusGetSecurityInfo;
import org.openapijsonschematools.client.paths.petfindbystatus.get.QueryParameters;
import org.openapijsonschematools.client.paths.petfindbystatus.get.Parameters;
import org.openapijsonschematools.client.paths.petfindbystatus.get.Responses;

public class Get {
    public static class GetCallData {
        public PetfindbystatusServerInfo.@Nullable ServerIndex serverIndex;
        public PetfindbystatusGetSecurityInfo.@Nullable SecurityIndex securityIndex;
        public QueryParameters.@Nullable QueryParameters1 queryParameters;
    }

    public interface SetterForServerIndex <T> {
        GetCallData getInstance();
        T getBuilderAfterServerIndex(GetCallData instance);
        default T serverIndex(PetfindbystatusServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForSecurityIndex <T> {
        GetCallData getInstance();
        T getBuilderAfterSecurityIndex(GetCallData instance);
        default T securityIndex(PetfindbystatusGetSecurityInfo.SecurityIndex securityIndex) {
            var instance = getInstance();
            instance.securityIndex = securityIndex;
            return getBuilderAfterSecurityIndex(instance);
        }
    }

    public interface SetterForQueryParameters <T> {
        GetCallData getInstance();
        T getBuilderAfterQueryParameters(GetCallData instance);
        default T queryParameters(QueryParameters.QueryParameters1 queryParameters) {
            var instance = getInstance();
            instance.queryParameters = queryParameters;
            return getBuilderAfterQueryParameters(instance);
        }
    }

    public static class Get0RequestBuilder {
        private final GetCallData instance;

        public Get0RequestBuilderGetCallData instance) {
            this.instance = instance;
        }
    }
    public static class GetRequestBuilder {
        private final GetCallData instance;

        public GetRequestBuilder() {
            this.instance = new GetCallData();
        }
    }
}
