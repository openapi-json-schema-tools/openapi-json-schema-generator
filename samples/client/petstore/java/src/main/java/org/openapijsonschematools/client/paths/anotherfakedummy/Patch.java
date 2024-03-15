package org.openapijsonschematools.client.paths.anotherfakedummy;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.anotherfakedummy.patch.RequestBody;
import org.openapijsonschematools.client.paths.anotherfakedummy.patch.Responses;

public class Patch {

    public static class PatchRequest {
        public RequestBody.SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;

        public PatchRequest(
            RequestBody.SealedRequestBody requestBody,
            RootServerInfo.@Nullable ServerIndex serverIndex
        ) {
            this.requestBody = requestBody;
            this.serverIndex = serverIndex;
        }
    }

    public static class PatchNullableRequest {
        public RootServerInfo.@Nullable ServerIndex serverIndex;
        public RequestBody.@Nullable SealedRequestBody requestBody;
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

    public interface SetterForRequestBody <T> {
        PatchNullableRequest getInstance();
        T getBuilderAfterRequestBody(PatchNullableRequest instance);
        default T requestBody(RequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public static class Patch0RequestBuilder {
        private final PatchNullableRequest instance;

        public Patch0RequestBuilder(PatchNullableRequest instance) {
            this.instance = instance;
        }

        public PatchRequest build() {
            // todo casting code here
        }
    }
    public static class PatchRequestBuilder {
        private final PatchNullableRequest instance;

        public PatchRequestBuilder() {
            this.instance = new PatchNullableRequest();
        }
    }
}
