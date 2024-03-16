package org.openapijsonschematools.client.paths.fake;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fake.delete.FakeDeleteSecurityInfo;
import org.openapijsonschematools.client.paths.fake.delete.HeaderParameters;
import org.openapijsonschematools.client.paths.fake.delete.QueryParameters;
import org.openapijsonschematools.client.paths.fake.delete.Parameters;
import org.openapijsonschematools.client.paths.fake.delete.Responses;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.paths.Fake;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Delete {

    public static class Delete1 extends Fake {
        private final ApiConfiguration apiConfiguration;

        public Delete1(ApiConfiguration apiConfiguration) {
            this.apiConfiguration = apiConfiguration;
        }

        public Responses.EndpointResponse delete(DeleteRequest request) {
            Map<String, List<String>> headers = apiConfiguration.getDefaultHeaders();

            var headersSerializer = new Parameters.HeaderParametersSerializer();
            Map<String, List<String>> serializedHeaders = headersSerializer.serialize(request.headerParameters);
            headers.putAll(serializedHeaders);

            var querySerializer = new Parameters.QueryParametersSerializer();
            Map<String, String> queryMap = querySerializer.getQueryMap(request.queryParameters);
            // todo serialize all parameter types
        }
    }

    public static class DeleteRequest {
        public HeaderParameters.HeaderParametersMap headerParameters;
        public QueryParameters.QueryParametersMap queryParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public FakeDeleteSecurityInfo.@Nullable SecurityIndex securityIndex;

        public DeleteRequest(
            HeaderParameters.HeaderParametersMap headerParameters,
            QueryParameters.QueryParametersMap queryParameters,
            RootServerInfo.@Nullable ServerIndex serverIndex,
            FakeDeleteSecurityInfo.@Nullable SecurityIndex securityIndex
        ) {
            this.headerParameters = headerParameters;
            this.queryParameters = queryParameters;
            this.serverIndex = serverIndex;
            this.securityIndex = securityIndex;
        }
    }

    public static class DeleteNullableRequest {
        public HeaderParameters.@Nullable HeaderParametersMap headerParameters;
        public QueryParameters.@Nullable QueryParametersMap queryParameters;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public FakeDeleteSecurityInfo.@Nullable SecurityIndex securityIndex;
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
        default T securityIndex(FakeDeleteSecurityInfo.SecurityIndex securityIndex) {
            var instance = getInstance();
            instance.securityIndex = securityIndex;
            return getBuilderAfterSecurityIndex(instance);
        }
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

    public interface SetterForQueryParameters <T> {
        DeleteNullableRequest getInstance();
        T getBuilderAfterQueryParameters(DeleteNullableRequest instance);
        default T queryParameters(QueryParameters.QueryParametersMap queryParameters) {
            var instance = getInstance();
            instance.queryParameters = queryParameters;
            return getBuilderAfterQueryParameters(instance);
        }
    }

    public static class Delete00RequestBuilder implements SetterForServerIndex<Delete00RequestBuilder>, SetterForSecurityIndex<Delete00RequestBuilder> {
        private final DeleteNullableRequest instance;

        public Delete00RequestBuilder(DeleteNullableRequest instance) {
            this.instance = instance;
        }

        public DeleteRequest build() {
            var headerParameters = instance.headerParameters;
            if (headerParameters == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            var queryParameters = instance.queryParameters;
            if (queryParameters == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new DeleteRequest(
                headerParameters,
                queryParameters,
                instance.serverIndex,
                instance.securityIndex
            );
        }

        public DeleteNullableRequest getInstance() {
            return instance;
        }

        public Delete00RequestBuilder getBuilderAfterServerIndex(DeleteNullableRequest instance) {
            return this;
        }

        public Delete00RequestBuilder getBuilderAfterSecurityIndex(DeleteNullableRequest instance) {
            return this;
        }
    }
    public static class Delete01RequestBuilder implements SetterForQueryParameters<Delete00RequestBuilder> {
        private final DeleteNullableRequest instance;

        public Delete01RequestBuilder(DeleteNullableRequest instance) {
            this.instance = instance;
        }

        public DeleteNullableRequest getInstance() {
            return instance;
        }

        public Delete00RequestBuilder getBuilderAfterQueryParameters(DeleteNullableRequest instance) {
            return new Delete00RequestBuilder(instance);
        }
    }
    public static class Delete10RequestBuilder implements SetterForHeaderParameters<Delete00RequestBuilder> {
        private final DeleteNullableRequest instance;

        public Delete10RequestBuilder(DeleteNullableRequest instance) {
            this.instance = instance;
        }

        public DeleteNullableRequest getInstance() {
            return instance;
        }

        public Delete00RequestBuilder getBuilderAfterHeaderParameters(DeleteNullableRequest instance) {
            return new Delete00RequestBuilder(instance);
        }
    }
    public static class DeleteRequestBuilder implements SetterForHeaderParameters<Delete01RequestBuilder>, SetterForQueryParameters<Delete10RequestBuilder> {
        private final DeleteNullableRequest instance;

        public DeleteRequestBuilder() {
            this.instance = new DeleteNullableRequest();
        }

        public DeleteNullableRequest getInstance() {
            return instance;
        }

        public Delete01RequestBuilder getBuilderAfterHeaderParameters(DeleteNullableRequest instance) {
            return new Delete01RequestBuilder(instance);
        }

        public Delete10RequestBuilder getBuilderAfterQueryParameters(DeleteNullableRequest instance) {
            return new Delete10RequestBuilder(instance);
        }
    }
}
