package org.openapijsonschematools.client.paths.fakejsonpatch;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.openapijsonschematools.client.paths.fakejsonpatch.patch.RequestBody;
import org.openapijsonschematools.client.RootServerInfo;
import org.openapijsonschematools.client.paths.fakejsonpatch.patch.Responses;

public class Patch {

    public static class PatchRequest {
        public RequestBody.@Nullable SealedRequestBody requestBody;
        public RootServerInfo.@Nullable ServerIndex serverIndex;
    }

    public interface SetterForRequestBody <T> {
        PatchRequest getInstance();
        T getBuilderAfterRequestBody(PatchRequest instance);
        default T requestBody(RequestBody.SealedRequestBody requestBody) {
            var instance = getInstance();
            instance.requestBody = requestBody;
            return getBuilderAfterRequestBody(instance);
        }
    }

    public interface SetterForServerIndex <T> {
        PatchRequest getInstance();
        T getBuilderAfterServerIndex(PatchRequest instance);
        default T serverIndex(RootServerInfo.ServerIndex serverIndex) {
            var instance = getInstance();
            instance.serverIndex = serverIndex;
            return getBuilderAfterServerIndex(instance);
        }
    }

    public static class PatchRequestBuilder implements SetterForRequestBody<PatchRequestBuilder>, SetterForServerIndex<PatchRequestBuilder> {
        private final PatchRequest instance;

        public PatchRequestBuilder() {
            this.instance = new PatchRequest();
        }

        public PatchRequest build() {
            return instance;
        }

        public PatchRequest getInstance() {
            return instance;
        }

        public PatchRequestBuilder getBuilderAfterRequestBody(PatchRequest instance) {
            return this;
        }

        public PatchRequestBuilder getBuilderAfterServerIndex(PatchRequest instance) {
            return this;
        }
    }
}
