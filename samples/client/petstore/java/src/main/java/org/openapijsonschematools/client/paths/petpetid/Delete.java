package org.openapijsonschematools.client.paths.petpetid;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.petpetid.delete.HeaderParameters;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.petpetid.delete.PetpetidDeleteSecurityInfo;
import org.openapijsonschematools.client.paths.petpetid.delete.PathParameters;
import org.openapijsonschematools.client.paths.petpetid.delete.Parameters;
import org.openapijsonschematools.client.paths.petpetid.delete.Responses;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.paths.PetpetId;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Delete {

    public static class Delete1 extends PetpetId {
        private final ApiConfiguration apiConfiguration;

        public Delete1(ApiConfiguration apiConfiguration) {
            this.apiConfiguration = apiConfiguration;
        }

        public Responses.EndpointResponse delete(DeleteRequest request) {
            Map<String, List<String>> headers = apiConfiguration.getDefaultHeaders();

            if (request.headerParameters != null) {
                var headersSerializer = new Parameters.HeaderParametersSerializer();
                Map<String, List<String>> serializedHeaders = headersSerializer.serialize(request.headerParameters);
                headers.putAll(serializedHeaders);
            }

            var pathSerializer = new Parameters.PathParametersSerializer();
            String updatedPath = pathSerializer.serialize(request.pathParameters, path);
            // todo serialize all parameter types
        }
    }

    public static class DeleteRequest {
        public PathParameters.PathParametersMap pathParameters;
        public HeaderParameters.@Nullable HeaderParametersMap headerParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public PetpetidDeleteSecurityInfo.@Nullable SecurityIndex securityIndex;

        public DeleteRequest(
            PathParameters.PathParametersMap pathParameters,
            HeaderParameters.@Nullable HeaderParametersMap headerParameters,
            RootServerInfo.@Nullable ServerIndex serverIndex,
            PetpetidDeleteSecurityInfo.@Nullable SecurityIndex securityIndex
        ) {
            this.pathParameters = pathParameters;
            this.headerParameters = headerParameters;
            this.serverIndex = serverIndex;
            this.securityIndex = securityIndex;
        }
    }

    public static class DeleteNullableRequest {
        public PathParameters.@Nullable PathParametersMap pathParameters;
        public HeaderParameters.@Nullable HeaderParametersMap headerParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public PetpetidDeleteSecurityInfo.@Nullable SecurityIndex securityIndex;
    }

    public interface SetterForHeaderParameters <T> {
        DeleteNullableRequest getInstance();
        T getBuilderAfterHeaderParameters(DeleteNullableRequest instance);
        default T headerParameters(HeaderParameters.HeaderParametersMap headerParameters) {
            var instance = getInstance();
            instance.headerParameters = headerParameters;
            return getBuilderAfterHeaderParameters(instance);
        }
    }

    public interface SetterForServerIndex <T> {
        DeleteNullableRequest getInstance();
        T getBuilderAfterServerIndex(DeleteNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForSecurityIndex <T> {
        DeleteNullableRequest getInstance();
        T getBuilderAfterSecurityIndex(DeleteNullableRequest instance);
        default T securityIndex(PetpetidDeleteSecurityInfo.SecurityIndex securityIndex) {
            var instance = getInstance();
            instance.securityIndex = securityIndex;
            return getBuilderAfterSecurityIndex(instance);
        }
    }

    public interface SetterForPathParameters <T> {
        DeleteNullableRequest getInstance();
        T getBuilderAfterPathParameters(DeleteNullableRequest instance);
        default T pathParameters(PathParameters.PathParametersMap pathParameters) {
            var instance = getInstance();
            instance.pathParameters = pathParameters;
            return getBuilderAfterPathParameters(instance);
        }
    }

    public static class Delete0RequestBuilder implements SetterForHeaderParameters<Delete0RequestBuilder>, SetterForServerIndex<Delete0RequestBuilder>, SetterForSecurityIndex<Delete0RequestBuilder> {
        private final DeleteNullableRequest instance;

        public Delete0RequestBuilder(DeleteNullableRequest instance) {
            this.instance = instance;
        }

        public DeleteRequest build() {
            var pathParameters = instance.pathParameters;
            if (pathParameters == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new DeleteRequest(
                pathParameters,
                instance.headerParameters,
                instance.serverIndex,
                instance.securityIndex
            );
        }

        public DeleteNullableRequest getInstance() {
            return instance;
        }

        public Delete0RequestBuilder getBuilderAfterHeaderParameters(DeleteNullableRequest instance) {
            return this;
        }

        public Delete0RequestBuilder getBuilderAfterServerIndex(DeleteNullableRequest instance) {
            return this;
        }

        public Delete0RequestBuilder getBuilderAfterSecurityIndex(DeleteNullableRequest instance) {
            return this;
        }
    }
    public static class DeleteRequestBuilder implements SetterForPathParameters<Delete0RequestBuilder> {
        private final DeleteNullableRequest instance;

        public DeleteRequestBuilder() {
            this.instance = new DeleteNullableRequest();
        }

        public DeleteNullableRequest getInstance() {
            return instance;
        }

        public Delete0RequestBuilder getBuilderAfterPathParameters(DeleteNullableRequest instance) {
            return new Delete0RequestBuilder(instance);
        }
    }
}
