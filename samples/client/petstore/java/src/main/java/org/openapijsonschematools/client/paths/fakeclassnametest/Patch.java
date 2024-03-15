package org.openapijsonschematools.client.paths.fakeclassnametest;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakeclassnametest.patch.FakeclassnametestPatchSecurityInfo;
import org.openapijsonschematools.client.paths.fakeclassnametest.patch.RequestBody;
import org.openapijsonschematools.client.paths.fakeclassnametest.patch.Responses;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Patch {

    public static class Patch1 {
        private final ApiConfiguration apiConfiguration;

        public Patch1(ApiConfiguration apiConfiguration) {
            this.apiConfiguration = apiConfiguration;
        }

        public Responses.EndpointResponse patch(PatchRequest request) {
            Map<String, List<String>> headers = apiConfiguration.getDefaultHeaders();
            SerializedRequestBody serializedRequestBody = new RequestBody.RequestBody1().serialize(
                request.requestBody
            );
            var contentTypeHeaderValues = headers.getOrDefault("Content-Type", new ArrayList<>());
            contentTypeHeaderValues.add(serializedRequestBody.contentType);
            // todo serialize all parameter types
        }
    }

    public static class PatchRequest {
        public RequestBody.SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public FakeclassnametestPatchSecurityInfo.@Nullable SecurityIndex securityIndex;

        public PatchRequest(
            RequestBody.SealedRequestBody requestBody,
            RootServerInfo.@Nullable ServerIndex serverIndex,
            FakeclassnametestPatchSecurityInfo.@Nullable SecurityIndex securityIndex
        ) {
            this.requestBody = requestBody;
            this.serverIndex = serverIndex;
            this.securityIndex = securityIndex;
        }
    }

    public static class PatchNullableRequest {
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public FakeclassnametestPatchSecurityInfo.@Nullable SecurityIndex securityIndex;
    }

    public interface SetterForServerIndex <T> {
        PatchNullableRequest getInstance();
        T getBuilderAfterServerIndex(PatchNullableRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public interface SetterForSecurityIndex <T> {
        PatchNullableRequest getInstance();
        T getBuilderAfterSecurityIndex(PatchNullableRequest instance);
        default T securityIndex(FakeclassnametestPatchSecurityInfo.SecurityIndex securityIndex) {
            var instance = getInstance();
            instance.securityIndex = securityIndex;
            return getBuilderAfterSecurityIndex(instance);
        }
    }

    public interface SetterForRequestBody <T> {
        PatchNullableRequest getInstance();
        T getBuilderAfterRequestBody(PatchNullableRequest instance);
        default T requestBody(RequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public static class Patch0RequestBuilder implements SetterForServerIndex<Patch0RequestBuilder>, SetterForSecurityIndex<Patch0RequestBuilder> {
        private final PatchNullableRequest instance;

        public Patch0RequestBuilder(PatchNullableRequest instance) {
            this.instance = instance;
        }

        public PatchRequest build() {
            var requestBody = instance.requestBody;
            if (requestBody == null) {
                throw new RuntimeException("invalid null value for required parameter");
            }
            return new PatchRequest(
                requestBody,
                instance.serverIndex,
                instance.securityIndex
            );
        }

        public PatchNullableRequest getInstance() {
            return instance;
        }

        public Patch0RequestBuilder getBuilderAfterServerIndex(PatchNullableRequest instance) {
            return this;
        }

        public Patch0RequestBuilder getBuilderAfterSecurityIndex(PatchNullableRequest instance) {
            return this;
        }
    }
    public static class PatchRequestBuilder implements SetterForRequestBody<Patch0RequestBuilder> {
        private final PatchNullableRequest instance;

        public PatchRequestBuilder() {
            this.instance = new PatchNullableRequest();
        }

        public PatchNullableRequest getInstance() {
            return instance;
        }

        public Patch0RequestBuilder getBuilderAfterRequestBody(PatchNullableRequest instance) {
            return new Patch0RequestBuilder(instance);
        }
    }
}
