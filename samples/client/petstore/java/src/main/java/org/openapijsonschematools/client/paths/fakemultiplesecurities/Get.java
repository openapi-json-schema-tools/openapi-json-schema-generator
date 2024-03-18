package org.openapijsonschematools.client.paths.fakemultiplesecurities;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakemultiplesecurities.get.FakemultiplesecuritiesGetSecurityInfo;
import org.openapijsonschematools.client.paths.fakemultiplesecurities.get.Responses;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.restclient.RestClient;
import org.openapijsonschematools.client.paths.FakemultipleSecurities;
import org.openapijsonschematools.client.securityrequirementobjects.SecurityRequirementObject;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.util.List;
import java.util.Map;

public class Get {

    public static class Get1 extends FakemultipleSecurities {
        private static final String method = "get";

        public Get1(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
            super(apiConfiguration, schemaConfiguration);
        }

        public Responses.EndpointResponse get(GetRequest request) throws IOException, InterruptedException {
            Map<String, List<String>> headers = apiConfiguration.getDefaultHeaders();
            HttpRequest.BodyPublisher bodyPublisher = HttpRequest.BodyPublishers.noBody();
            // TODO set this to a map if there is a query security scheme
            @Nullable Map<String, String> queryMap = null;
            String host = apiConfiguration.getServer(request.serverIndex).url();
            SecurityRequirementObject securityRequirementObject = apiConfiguration.getSecurityRequirementObject(request.securityIndex);
            updateParamsForAuth(
                securityRequirementObject,
                headers,
                path,
                method,
                bodyPublisher,
                queryMap
            );

            String url = host + path;
            var httpRequest = RestClient.getRequest(
                url,
                method,
                bodyPublisher,
                headers
            );
            var response = RestClient.getResponse(httpRequest, client);
            return new Responses.Responses1().deserialize(response, schemaConfiguration);
        }
    }

    public static class GetRequest {
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public FakemultiplesecuritiesGetSecurityInfo.@Nullable SecurityIndex securityIndex;
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
        default T securityIndex(FakemultiplesecuritiesGetSecurityInfo.SecurityIndex securityIndex) {
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
